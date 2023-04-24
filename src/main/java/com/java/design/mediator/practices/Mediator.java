package com.java.design.mediator.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:32 AM 4/24/2023
 */
public interface Mediator {
    void placeOrder(Order order);
    void cancelOrder(Order order);
}
