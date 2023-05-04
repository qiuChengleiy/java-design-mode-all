package com.java.design.strategy.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:57 AM 5/4/2023
 */
public class AlipayStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("使用支付宝支付" + amount + "元");
    }
}
