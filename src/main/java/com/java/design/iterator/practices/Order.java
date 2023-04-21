package com.java.design.iterator.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:03 AM 4/21/2023
 */
public class Order {
    private String orderNumber;
    private String orderTime;
    private double orderAmount;

    public Order(String orderNumber, String orderTime, double orderAmount) {
        this.orderNumber = orderNumber;
        this.orderTime = orderTime;
        this.orderAmount = orderAmount;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
}
