package service;

import java.sql.Connection;
import java.time.Instant;
import java.util.List;
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

        try (Connection connection = DataSource.getConnection()) {

            DSLContext dslContext = DSL.using(connection);
            dslContext.transaction(nested -> {

                List<User> byPhones = userRepository.findByPhones(request.getRecipientPhone(), request.getSenderPhone(), nested);

                User recipient = byPhones.get(0).getPhone().equals(request.getRecipientPhone()) ? byPhones.get(0) : byPhones.get(1);
                User sender = byPhones.get(0).getPhone().equals(request.getSenderPhone()) ? byPhones.get(0) : byPhones.get(1);

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
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception e1) {
            throw new RuntimeException(e1);
        }


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
