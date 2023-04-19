package com.java.design.command.practices;

/**
 * @Author qcl
 * @Description 定义接收者类，即订单类
 * @Date 9:39 AM 4/19/2023
 */
public class Order {
    private int orderId;
    private String status;

    public void create() {
        System.out.println("订单创建成功");
        this.status = "Created";
    }

    public void cancelCreate() {
        System.out.println("取消订单创建");
        this.status = "";
    }

    public void cancel() {
        System.out.println("订单取消成功");
        this.status = "Cancelled";
    }

    public void uncancel() {
        System.out.println("订单取消被撤销");
        this.status = "Created";
    }

    public void pay() {
        System.out.println("订单支付成功");
        this.status = "Paid";
    }

    public void unpay() {
        System.out.println("订单支付被撤销");
        this.status = "Created";
    }

    public String getStatus() {
        return status;
    }
}

