package com.java.design.template.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:21 AM 5/5/2023
 */
public class OfflineOrder extends Order {
    // 实现创建订单
    void createOrder() {
        System.out.println("Offline order created");
    }
    // 实现支付订单
    void payOrder() {
        System.out.println("Offline order paid");
    }
    // 实现发货
    void deliveryOrder() {
        System.out.println("Offline order delivered through physical store");
    }
}
