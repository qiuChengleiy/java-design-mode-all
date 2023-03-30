package com.java.design.factory.pay;

/**
 * @Author qcl
 * @Description
 * @Date 10:17 AM 3/30/2023
 */
public class PayTest {
    public static void main(String[] args) throws Exception {
        PayFactory wxPay = new WxPayFactory();
        Payment wxPayPayment = wxPay.createPayment();
        wxPayPayment.pay();
    }
}
