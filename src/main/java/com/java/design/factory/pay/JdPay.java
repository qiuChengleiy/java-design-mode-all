package com.java.design.factory.pay;

/**
 * @Author qcl
 * @Description
 * @Date 10:11 AM 3/30/2023
 */
public class JdPay implements Payment {
    @Override
    public void pay() {
        System.out.println("京东支付");
    }
}
