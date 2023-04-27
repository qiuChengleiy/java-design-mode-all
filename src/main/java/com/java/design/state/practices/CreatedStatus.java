package com.java.design.state.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:35 AM 4/27/2023
 */
public class CreatedStatus implements OrderStatus {

    @Override
    public void process(Order order) {
        System.out.println("订单已经下单，等待付款");
        order.setStatus(new PaidStatus());
    }
}
