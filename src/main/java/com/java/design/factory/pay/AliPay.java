package com.java.design.factory.pay;

/**
 * @Author qcl
 * @Description
 * @Date 10:11 AM 3/30/2023
 */
public class AliPay implements Payment {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
