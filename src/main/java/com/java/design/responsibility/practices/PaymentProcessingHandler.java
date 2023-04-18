package com.java.design.responsibility.practices;


/**
 * @Author qcl
 * @Description
 * @Date 9:46 AM 4/18/2023
 */
public class PaymentProcessingHandler extends PaymentHandler {
    public void handle(Payment payment) {
        System.out.println("Payment processing successful.");
    }
}