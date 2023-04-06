package com.java.design.bridge.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:00 AM 4/6/2023
 */
public class NormalOrder extends Order {
    public NormalOrder(OrderProcessor orderProcessor) {
        super(orderProcessor);
    }

    @Override
    public void process() {
        orderProcessor.processNormalOrder();
    }
}
