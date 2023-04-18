package com.java.design.responsibility.practices;


/**
 * @Author qcl
 * @Description
 * @Date 9:46 AM 4/18/2023
 */
public class PaymentValidationHandler extends PaymentHandler {
    public void handle(Payment payment) {
        if (payment.getPaymentMethod() == null) {
            System.out.println("Payment validation failed.");
            return;
        }

        System.out.println("Payment validation passed.");
        if (successor != null) {
            successor.handle(payment);
        }
    }
}
