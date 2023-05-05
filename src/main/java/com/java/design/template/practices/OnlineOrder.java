package com.java.design.template.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:21 AM 5/5/2023
 */
public class OnlineOrder extends Order {
    // 实现创建订单
    void createOrder() {
        System.out.println("Online order created");
    }
    // 实现支付订单
    void payOrder() {
        System.out.println("Online order paid and confirmed");
    }
    // 实现发货
    void deliveryOrder() {
        System.out.println("Online order delivered through courier");
    }
}
