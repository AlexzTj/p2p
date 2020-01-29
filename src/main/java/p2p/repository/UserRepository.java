package p2p.repository;

import static org.jooq.generated.public_.tables.User.USER;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.jooq.Configuration;
import org.jooq.generated.public_.tables.records.UserRecord;
import org.jooq.impl.DSL;
import p2p.domain.User;


public class UserRepository {

    public User findByPhone(String phone, Configuration connection) {
        UserRecord userRecord = DSL.using(connection).selectFrom(USER)
            .where(USER.PHONE.eq(phone)).fetchOne();

        return getUser(userRecord);
    }

    public List<User> findByPhones(String phone1, String phone2, Configuration connection) {
        List<UserRecord> userRecords = DSL.using(connection).selectFrom(USER)
            .where(USER.PHONE.in(phone1, phone2)).forUpdate().fetchInto(UserRecord.class);

        return Optional.ofNullable(userRecords).map(e -> e.stream().map(this::getUser).collect(Collectors.toList()))
            .orElse(Collections.emptyList());
    }

    public User findById(String id, Configuration connection) {
        UserRecord userRecord = DSL.using(connection).selectFrom(USER)
            .where(USER.ID.eq(id)).fetchOne();

        return getUser(userRecord);
    }

    public void save(User user, Configuration connection) {
        DSL.using(connection)
            .insertInto(USER, USER.ID, USER.PHONE, USER.BALANCE)
            .values(user.getId(), user.getPhone(), user.getBalance() == null ? 0 : user.getBalance().doubleValue()).execute();
    }

    public void update(User user, Configuration connection) {
        DSL.using(connection)
            .update(USER)
            .set(USER.BALANCE, user.getBalance().doubleValue())
            .where(USER.ID.eq(user.getId()))
            .execute();
    }

    public void deleteAll(Configuration connection) {
        DSL.using(connection)
            .delete(USER)
            .execute();
    }

    private User getUser(UserRecord userRecord) {
        if (userRecord == null) {
            return null;
        }
        return User.builder()
            .id(userRecord.getId())
            .balance(BigDecimal.valueOf(userRecord.getBalance()))
            .bic(userRecord.getBic())
            .iban(userRecord.getIban())
            .name(userRecord.getName())
            .phone(userRecord.getPhone())
            .build();
    }
}
