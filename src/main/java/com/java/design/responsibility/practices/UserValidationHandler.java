package com.java.design.responsibility.practices;


/**
 * @Author qcl
 * @Description
 * @Date 9:46 AM 4/18/2023
 */
public class UserValidationHandler extends PaymentHandler {
    public void handle(Payment payment) {
        if (payment.getUser() == null) {
            System.out.println("User validation failed.");
            return;
        }

        System.out.println("User validation passed.");
        if (successor != null) {
            successor.handle(payment);
        }
    }
}
