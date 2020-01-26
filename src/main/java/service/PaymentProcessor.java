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
//        try {
//           // connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
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
            log.info("sender {}", sender.getBalance());
            log.info("reipient {}", recipient.getBalance());
        });



    }
}
