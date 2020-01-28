package p2p.controller;

import lombok.RequiredArgsConstructor;
import p2p.JsonUtils;
import p2p.dto.DepositRequest;
import p2p.dto.PaymentRequest;
import service.PaymentProcessor;
import spark.Request;
import spark.Response;

@RequiredArgsConstructor
public class PaymentController {

    private final PaymentProcessor paymentProcessor;

    public Response transfer(Request request, Response response) {
        PaymentRequest paymentRequest = JsonUtils.convert(request.body(), PaymentRequest.class);
        paymentProcessor.process(paymentRequest);
        response.status(200);
        return response;
    }

    public Response deposit(Request request, Response response) {
        DepositRequest depositRequest = JsonUtils.convert(request.body(), DepositRequest.class);
        paymentProcessor.process(depositRequest);
        response.status(200);
        return response;
    }
}
