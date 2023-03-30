package com.java.design.factory.pay;

/**
 * @Author qcl
 * @Description
 * @Date 10:10 AM 3/30/2023
 */
public class WxPay implements Payment {

    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
