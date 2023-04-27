package com.java.design.state.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:35 AM 4/27/2023
 */
public class ShippedStatus implements OrderStatus {

    @Override
    public void process(Order order) {
        System.out.println("订单已经发货，等待确认收货");
        order.setStatus(new DeliveredStatus());
    }
}
