package com.java.design.factory.pay;

/**
 * @Author qcl
 * @Description
 * @Date 10:14 AM 3/30/2023
 */
public class JdPayFactory implements PayFactory {
    @Override
    public Payment createPayment() {
        return new JdPay();
    }
}
