package p2p.controller;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.jooq.Configuration;
import org.jooq.impl.DSL;
import p2p.JsonUtils;
import p2p.domain.User;
import p2p.dto.RegisterUserRequest;
import p2p.repository.DataSource;
import p2p.repository.UserRepository;
import spark.Request;
import spark.Response;

@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    public Response registerUser(Request request, Response response) {
        RegisterUserRequest registerUserRequest = JsonUtils.convert(request.body(), RegisterUserRequest.class);
        Configuration configuration = DSL.using(DataSource.getConnection()).configuration();
        User existing = userRepository.findByPhone(registerUserRequest.getPhone(), configuration);
        if (existing != null) {
            throw new IllegalArgumentException("user already exists");
        }
        String id = UUID.randomUUID().toString();
        userRepository.save(User.builder()
            .phone(registerUserRequest.getPhone())
            .name(registerUserRequest.getName())
            .id(id)
            .build(), configuration);
        response.status(200);
        response.body("{\"userId\":\"" + id + "\"}");
        return response;
    }
}
