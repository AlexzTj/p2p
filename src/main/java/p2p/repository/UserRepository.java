package p2p.repository;

import static org.jooq.generated.public_.tables.User.USER;

import java.math.BigDecimal;
import org.jooq.Configuration;
import org.jooq.generated.public_.tables.records.UserRecord;
import org.jooq.impl.DSL;
import p2p.domain.User;


public class UserRepository {

    public User findByPhone(String phone, Configuration connection) {
        UserRecord userRecord = DSL.using(connection).selectFrom(USER)
            .where(USER.PHONE.eq(phone)).fetchSingle();

        return getUser(userRecord);
    }

    public void save(User user, Configuration connection) {
        DSL.using(connection)
            .insertInto(USER, USER.ID, USER.PHONE, USER.BALANCE)
            .values(user.getId(), user.getPhone(), user.getBalance().doubleValue()).execute();
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
