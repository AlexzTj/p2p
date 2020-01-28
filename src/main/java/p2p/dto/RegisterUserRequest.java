package p2p.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@JsonDeserialize(builder = RegisterUserRequest.RegisterUserRequestBuilder.class)
public class RegisterUserRequest {

    private String name;
    private String phone;

    @JsonPOJOBuilder(withPrefix = "")
    public static class RegisterUserRequestBuilder {}
}
