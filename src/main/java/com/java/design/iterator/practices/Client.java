package com.java.design.iterator.practices;

import java.util.Iterator;

/**
 * @Author qcl
 * @Description
 * @Date 10:05 AM 4/21/2023
 */
public class Client {
    public static void main(String[] args) throws Exception {
        OrderList orderList = new OrderList();
        orderList.addOrder(new Order("20230001", "2023-04-21 10:00:00", 100.00));
        orderList.addOrder(new Order("20230002", "2023-04-22 11:00:00", 200.00));
        orderList.addOrder(new Order("20230003", "2023-04-23 12:00:00", 300.00));

        Iterator<Order> iterator = orderList.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(order.getOrderNumber() + " " + order.getOrderTime() + " " + order.getOrderAmount());
        }
    }
}
