package com.java.design.state.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:35 AM 4/27/2023
 */
// 确认收货状态实现类
public class DeliveredStatus implements OrderStatus {

    @Override
    public void process(Order order) {
        System.out.println("订单已经确认收货，交易完成");
        order.setStatus(this);
    }
}
