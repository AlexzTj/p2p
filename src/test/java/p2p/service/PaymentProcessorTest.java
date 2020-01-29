package p2p.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.junit.Before;
import org.junit.Test;
import p2p.domain.Transaction;
import p2p.domain.TransactionType;
import p2p.domain.User;
import p2p.dto.DepositRequest;
import p2p.dto.PaymentRequest;
import p2p.repository.DataSource;
import p2p.repository.TransactionRepository;
import p2p.repository.UserRepository;
import service.PaymentProcessor;


public class PaymentProcessorTest {


    private UserRepository userRepository;

    private TransactionRepository transactionRepository;

    private PaymentProcessor target;
    private DSLContext dslContext;
    private Configuration configuration;

    @Before
    public void before() {
        dslContext = DSL.using(DataSource.getConnection());
        configuration = dslContext.configuration();
        userRepository = new UserRepository();
        transactionRepository = new TransactionRepository();
        target = new PaymentProcessor(userRepository, transactionRepository);
        transactionRepository.deleteAll(configuration);
        userRepository.deleteAll(configuration);
    }

    @Test
    public void when_PaymentRequested_then_TransferRequestedMoneyToProperUser() {
        User user1 = User.builder().id("190").phone("111").balance(BigDecimal.valueOf(200)).build();
        User user2 = User.builder().id("290").phone("222").balance(BigDecimal.valueOf(200)).build();

        userRepository.save(user1, configuration);
        userRepository.save(user2, configuration);

        PaymentRequest request = PaymentRequest.builder()
            .amount(BigDecimal.valueOf(10))
            .senderPhone("111")
            .recipientPhone("222")
            .build();

        target.process(request);

        User actualUser1 = userRepository.findByPhone(user1.getPhone(), configuration);
        User actualUser2 = userRepository.findByPhone(user2.getPhone(), configuration);

        assertThat(actualUser1.getBalance()).isEqualByComparingTo(user1.getBalance().add(request.getAmount().negate()));
        assertThat(actualUser2.getBalance()).isEqualByComparingTo(user2.getBalance().add(request.getAmount()));

        List<Transaction> transactionsUser1 = transactionRepository.findByUserId(actualUser1.getId(), configuration);
        List<Transaction> transactionsUser2 = transactionRepository.findByUserId(actualUser2.getId(), configuration);

        assertThat(transactionsUser1).size().isEqualTo(1);
        assertThat(transactionsUser1.get(0).getAmount()).isEqualByComparingTo(request.getAmount());
        assertThat(transactionsUser1.get(0).getType()).isEqualByComparingTo(TransactionType.WITHDRAW);

        assertThat(transactionsUser2).size().isEqualTo(1);
        assertThat(transactionsUser2.get(0).getAmount()).isEqualByComparingTo(request.getAmount());
        assertThat(transactionsUser2.get(0).getType()).isEqualByComparingTo(TransactionType.DEPOSIT);
    }

    /**
     * Prevent lost updates during parallel requests, by using "select for update" expression for both accounts.
     */
    @Test
    public void givenParallelRequests_when_PaymentRequested_then_TransferRequestedMoneyToProperUser() throws InterruptedException {
        User user1 = User.builder().id("190").phone("111").balance(BigDecimal.valueOf(2000)).build();
        User user2 = User.builder().id("290").phone("222").balance(BigDecimal.valueOf(2000)).build();

        userRepository.save(user1, configuration);
        userRepository.save(user2, configuration);

        PaymentRequest request = PaymentRequest.builder()
            .amount(BigDecimal.valueOf(10))
            .senderPhone("111")
            .recipientPhone("222")
            .build();

        PaymentRequest request2 = PaymentRequest.builder()
            .amount(BigDecimal.valueOf(5))
            .senderPhone("222")
            .recipientPhone("111")
            .build();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> target.process(request));
            executorService.submit(() -> target.process(request2));
        }

        executorService.awaitTermination(2, TimeUnit.SECONDS);
        executorService.shutdownNow();
        User actualUser1 = userRepository.findByPhone(user1.getPhone(), configuration);
        User actualUser2 = userRepository.findByPhone(user2.getPhone(), configuration);

        assertThat(actualUser1.getBalance()).isEqualByComparingTo(BigDecimal.valueOf(1950));
        assertThat(actualUser2.getBalance()).isEqualByComparingTo(BigDecimal.valueOf(2050));

    }

    @Test(expected = IllegalArgumentException.class)
    public void givenPaymentOverDraft_when_PaymentRequested_then_throwExceptionAndDontProcessPayment() {

        User user1 = User.builder().id("190").phone("111").balance(BigDecimal.valueOf(200)).build();
        User user2 = User.builder().id("290").phone("222").balance(BigDecimal.valueOf(200)).build();

        userRepository.save(user1, configuration);
        userRepository.save(user2, configuration);

        PaymentRequest request = PaymentRequest.builder()
            .amount(BigDecimal.valueOf(300))
            .senderPhone("111")
            .recipientPhone("222")
            .build();

        try {
            target.process(request);
        } finally {
            User actualUser1 = userRepository.findByPhone(user1.getPhone(), configuration);
            User actualUser2 = userRepository.findByPhone(user2.getPhone(), configuration);

            assertThat(actualUser1.getBalance()).isEqualByComparingTo(user1.getBalance());
            assertThat(actualUser2.getBalance()).isEqualByComparingTo(user2.getBalance());
            assertThat(transactionRepository.findAll(configuration)).isEmpty();
        }
    }

    @Test
    public void when_depositRequest_then_AddDepositAmountToUserBalance() {
        User user1 = User.builder().id("190").phone("111").balance(BigDecimal.valueOf(200)).build();

        userRepository.save(user1, configuration);

        DepositRequest request = DepositRequest.builder()
            .amount(BigDecimal.valueOf(300))
            .userId(user1.getId())
            .build();

        target.process(request);

        User actualUser1 = userRepository.findById(user1.getId(), configuration);

        assertThat(actualUser1.getBalance()).isEqualByComparingTo(user1.getBalance().add(request.getAmount()));

        List<Transaction> transactions = transactionRepository.findByUserId(user1.getId(), configuration);
        assertThat(transactions.size()).isEqualTo(1);
        assertThat(transactions.get(0).getType()).isEqualTo(TransactionType.DEPOSIT);
        assertThat(transactions.get(0).getAmount()).isEqualByComparingTo(request.getAmount());

    }
}