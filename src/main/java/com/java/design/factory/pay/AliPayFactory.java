package com.java.design.factory.pay;

/**
 * @Author qcl
 * @Description
 * @Date 10:13 AM 3/30/2023
 */
public class AliPayFactory implements PayFactory {
    @Override
    public Payment createPayment() {
        return new AliPay();
    }
}
