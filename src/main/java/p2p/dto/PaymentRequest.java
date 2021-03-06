package p2p.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@JsonDeserialize(builder = PaymentRequest.PaymentRequestBuilder.class)
public class PaymentRequest {

    private String senderPhone;
    private String recipientPhone;
    private BigDecimal amount;

    @JsonPOJOBuilder(withPrefix = "")
    public static class PaymentRequestBuilder {}
}
