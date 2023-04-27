package com.java.design.state.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:36 AM 4/27/2023
 */
public class Order {
    private OrderStatus status;

    public Order() {
        status = new CreatedStatus();
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void process() {
        status.process(this);
    }
}
