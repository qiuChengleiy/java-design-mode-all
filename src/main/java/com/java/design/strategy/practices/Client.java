package com.java.design.strategy.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:57 AM 5/4/2023
 */
public class Client {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new AlipayStrategy();
        EcommercePlatform ecommercePlatform = new EcommercePlatform(paymentStrategy);
        ecommercePlatform.pay(100);
        paymentStrategy = new WechatPayStrategy();
        ecommercePlatform.setPaymentStrategy(paymentStrategy);
        ecommercePlatform.pay(200);
        paymentStrategy = new BankPayStrategy();
        ecommercePlatform.setPaymentStrategy(paymentStrategy);
        ecommercePlatform.pay(300);
    }
}
