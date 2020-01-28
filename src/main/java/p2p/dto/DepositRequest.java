package p2p.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.math.BigDecimal;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@JsonDeserialize(builder = DepositRequest.DepositRequestBuilder.class)
public class DepositRequest {

    private String userId;
    private BigDecimal amount;

    @JsonPOJOBuilder(withPrefix = "")
    public static class DepositRequestBuilder {}
}
