package p2p.repository;

import static org.jooq.generated.public_.tables.Transaction.TRANSACTION;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jooq.Configuration;
import org.jooq.generated.public_.tables.records.TransactionRecord;
import org.jooq.impl.DSL;
import p2p.domain.Transaction;
import p2p.domain.TransactionType;

public class TransactionRepository {

    public void save(Transaction transaction, Configuration connection) {
        DSL.using(connection)
            .insertInto(TRANSACTION, TRANSACTION.ID, TRANSACTION.USER_ID,
                TRANSACTION.AMOUNT, TRANSACTION.CREATED_AT, TRANSACTION.TYPE)
            .values(transaction.getId(), transaction.getUserId(),
                transaction.getAmount().doubleValue(), Timestamp.from(transaction.getCreatedAt()),
                transaction.getType().name())
            .execute();
    }

    public List<Transaction> findByUserId(String id, Configuration connection) {
        List<TransactionRecord> result = DSL.using(connection).selectFrom(TRANSACTION)
            .where(TRANSACTION.USER_ID.eq(id)).fetchInto(TransactionRecord.class);
        return Optional.ofNullable(result).map(e -> e.stream().map(this::getTransaction).collect(Collectors.toList()))
            .orElse(Collections.emptyList());
    }

    public List<Transaction> findAll(Configuration connection) {
        List<TransactionRecord> result = DSL.using(connection).selectFrom(TRANSACTION).fetchInto(TransactionRecord.class);
        return Optional.ofNullable(result).map(e -> e.stream().map(this::getTransaction).collect(Collectors.toList()))
            .orElse(Collections.emptyList());
    }

    public void deleteAll(Configuration connection) {
        DSL.using(connection)
            .delete(TRANSACTION)
            .execute();
    }

    private Transaction getTransaction(TransactionRecord record) {
        return Transaction.builder()
            .id(record.getId())
            .type(TransactionType.valueOf(record.getType()))
            .createdAt(record.getCreatedAt().toInstant())
            .userId(record.getUserId())
            .amount(BigDecimal.valueOf(record.getAmount()))
            .build();
    }


}
