package com.java.design.state.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:36 AM 4/27/2023
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.process();
        order.process();
        order.process();
        order.process();

//        订单已经下单，等待付款
//        订单已经付款，等待发货
//        订单已经发货，等待确认收货
//        订单已经确认收货，交易完成
    }
}
