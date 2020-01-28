package service;

import static spark.Spark.after;

import lombok.RequiredArgsConstructor;
import p2p.controller.PaymentController;
import p2p.controller.UserController;
import spark.Spark;

@RequiredArgsConstructor
public class RestService {

    private final PaymentController paymentController;
    private final UserController userController;

    public void init() {
        commonSetup();

        Spark.post("/transfers", paymentController::transfer);
        Spark.post("/users", userController::registerUser);
        Spark.post("/deposits", paymentController::deposit);
    }

    public void commonSetup() {
        Spark.port(8080);
        after("/*", (req, res) ->
            res.type("application/json"));
        Spark.exception(IllegalArgumentException.class, (exception, request, response) -> {
            response.status(400);
            response.body("{\"error\":\"" + exception.getMessage() + "\"}");
        });
    }
}
