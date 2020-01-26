package p2p.domain;

import java.math.BigDecimal;
import java.time.Instant;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Transaction {

    private String id;
    private BigDecimal amount;
    private String userId;
    private TransactionType type;
    private Instant createdAt;
}
