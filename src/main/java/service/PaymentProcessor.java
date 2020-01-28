package service;

import java.sql.Connection;
import java.time.Instant;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import p2p.domain.Transaction;
import p2p.domain.TransactionType;
import p2p.domain.User;
import p2p.dto.DepositRequest;
import p2p.dto.PaymentRequest;
import p2p.repository.DataSource;
import p2p.repository.TransactionRepository;
import p2p.repository.UserRepository;

@RequiredArgsConstructor
@Slf4j
public class PaymentProcessor {

    private final UserRepository userRepository;
    private final TransactionRepository transactionRepository;

    public void process(PaymentRequest request) {
        Connection connection = DataSource.getConnection();

        DSLContext dslContext = DSL.using(connection);
        dslContext.transaction(nested -> {
            User recipient = userRepository.findByPhone(request.getRecipientPhone(), nested);
            User sender = userRepository.findByPhone(request.getSenderPhone(), nested);

            sender.withdraw(request.getAmount());
            recipient.deposit(request.getAmount());

            userRepository.update(recipient, nested);
            userRepository.update(sender, nested);
            transactionRepository.save(Transaction.builder()
                .userId(recipient.getId())
                .id(UUID.randomUUID().toString())
                .amount(request.getAmount())
                .createdAt(Instant.now())
                .type(TransactionType.DEPOSIT)
                .build(), nested);
            transactionRepository.save(Transaction.builder()
                .userId(sender.getId())
                .id(UUID.randomUUID().toString())
                .amount(request.getAmount())
                .createdAt(Instant.now())
                .type(TransactionType.WITHDRAW)
                .build(), nested);
            log.info("Transfer {} from sender {} to recipient {}", request.getAmount(), sender.getId(), recipient.getId());
        });


    }

    public void process(DepositRequest depositRequest) {
        Connection connection = DataSource.getConnection();

        DSLContext dslContext = DSL.using(connection);
        dslContext.transaction(nested -> {
            User user = userRepository.findById(depositRequest.getUserId(), nested);

            user.deposit(depositRequest.getAmount());

            userRepository.update(user, nested);
            transactionRepository.save(Transaction.builder()
                .userId(user.getId())
                .id(UUID.randomUUID().toString())
                .amount(depositRequest.getAmount())
                .createdAt(Instant.now())
                .type(TransactionType.DEPOSIT)
                .build(), nested);
            log.info("Deposit {} to  {} ", depositRequest.getAmount(), user.getId());
        });

    }
}
