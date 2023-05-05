package com.java.design.template.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:21 AM 5/5/2023
 */
public abstract class Order {
    // 模版方法，定义订单处理流程
    public final void processOrder() {
        createOrder();
        payOrder();
        deliveryOrder();
    }
    // 创建订单，由具体子类实现
    abstract void createOrder();
    // 支付订单，由具体子类实现
    abstract void payOrder();
    // 发货，由具体子类实现
    abstract void deliveryOrder();
}
