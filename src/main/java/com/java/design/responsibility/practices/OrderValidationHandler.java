package com.java.design.responsibility.practices;


/**
 * @Author qcl
 * @Description
 * @Date 9:45 AM 4/18/2023
 */
public class OrderValidationHandler extends PaymentHandler {
    public void handle(Payment payment) {
        if (payment.getOrder() == null) {
            System.out.println("Order validation failed.");
            return;
        }

        System.out.println("Order validation passed.");
        if (successor != null) {
            successor.handle(payment);
        }
    }
}
