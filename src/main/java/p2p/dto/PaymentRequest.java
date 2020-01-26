package p2p.dto;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PaymentRequest {

    private String senderPhone;
    private String recipientPhone;
    private BigDecimal amount;
}
