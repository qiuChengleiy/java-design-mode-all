package com.java.design.state.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:35 AM 4/27/2023
 */
public class PaidStatus implements OrderStatus {

    @Override
    public void process(Order order) {
        System.out.println("订单已经付款，等待发货");
        order.setStatus(new ShippedStatus());
    }
}
