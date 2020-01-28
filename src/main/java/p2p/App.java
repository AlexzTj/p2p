package p2p;

import org.jooq.Configuration;
import org.jooq.impl.DSL;
import p2p.controller.PaymentController;
import p2p.controller.UserController;
import p2p.repository.DataSource;
import p2p.repository.TransactionRepository;
import p2p.repository.UserRepository;
import service.PaymentProcessor;
import service.RestService;

public class App {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        TransactionRepository transactionRepository = new TransactionRepository();
        PaymentProcessor paymentProcessor = new PaymentProcessor(userRepository, transactionRepository);
        PaymentController paymentController = new PaymentController(paymentProcessor);
        UserController userController = new UserController(userRepository);
        RestService restService = new RestService(paymentController, userController);
        Configuration configuration = DSL.using(DataSource.getConnection()).configuration();
        transactionRepository.deleteAll(configuration);
        userRepository.deleteAll(configuration);
        restService.init();
    }

}
