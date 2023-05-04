package com.java.design.strategy.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:57 AM 5/4/2023
 */
public class EcommercePlatform {
    private PaymentStrategy paymentStrategy;
    public EcommercePlatform(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}
