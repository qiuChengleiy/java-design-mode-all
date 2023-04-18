package com.java.design.responsibility.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:49 AM 4/18/2023
 */
public class Client {
    public static void main(String[] args) {
        PaymentHandler orderValidationHandler = new OrderValidationHandler();
        PaymentHandler userValidationHandler = new UserValidationHandler();
        PaymentHandler paymentValidationHandler = new PaymentValidationHandler();
        PaymentHandler paymentProcessingHandler = new PaymentProcessingHandler();

        orderValidationHandler.setSuccessor(userValidationHandler);
        userValidationHandler.setSuccessor(paymentValidationHandler);
        paymentValidationHandler.setSuccessor(paymentProcessingHandler);

        Payment payment = new Payment(new Order(), new User(), new PaymentMethod());
        orderValidationHandler.handle(payment);
        userValidationHandler.handle(payment);
        paymentValidationHandler.handle(payment);
//        Order validation passed.
//                User validation passed.
//        Payment validation passed.
//                Payment processing successful.
//        User validation passed.
//                Payment validation passed.
//        Payment processing successful.
//                Payment validation passed.
//        Payment processing successful.
    }
}
