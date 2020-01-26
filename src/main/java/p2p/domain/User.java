package p2p.domain;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class User {

    private String id;
    private String bic;
    private String iban;
    private String name;
    private String phone;
    private BigDecimal balance;


    public synchronized void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("invalid amount");
        }
        if (balance.compareTo(amount) < 0) {
            throw new IllegalArgumentException("Not enough funds");
        }
        setBalance(balance.add(amount.negate()));
    }

    public synchronized void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("invalid amount");
        }
        setBalance(balance.add(amount));
    }
}
