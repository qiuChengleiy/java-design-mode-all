package com.java.design.bridge.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:00 AM 4/6/2023
 */
public abstract class Order {
    protected OrderProcessor orderProcessor;

    public Order(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    public abstract void process();
}
