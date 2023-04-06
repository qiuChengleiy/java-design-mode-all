package com.java.design.bridge.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:00 AM 4/6/2023
 */
public class RushOrder extends Order {
    public RushOrder(OrderProcessor orderProcessor) {
        super(orderProcessor);
    }

    @Override
    public void process() {
        orderProcessor.processRushOrder();
    }
}
