package com.java.design.mediator.practices;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date 10:32 AM 4/24/2023
 */
public class OrderMediator implements Mediator {

    private List<Order> orders = new ArrayList<>();

    @Override
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("New order placed: " + order.getOrderId());
    }

    @Override
    public void cancelOrder(Order order) {
        orders.remove(order);
        System.out.println("Cancelled order: " + order.getOrderId());
    }
}
