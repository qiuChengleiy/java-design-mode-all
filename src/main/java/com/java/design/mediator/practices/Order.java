package com.java.design.mediator.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:32 AM 4/24/2023
 */
public abstract class Order {
    protected Mediator mediator;
    protected String orderId;

    public Order(Mediator mediator, String orderId) {
        this.mediator = mediator;
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public abstract void place();
    public abstract void cancel();
}
