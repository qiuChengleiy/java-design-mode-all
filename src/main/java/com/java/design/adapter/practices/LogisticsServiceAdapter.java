package com.java.design.adapter.practices;

/**
 * @Author qcl
 * @Description 适配器接口
 * @Date 10:21 AM 4/4/2023
 */
public interface LogisticsServiceAdapter {
    void createOrder(String orderId, String senderAddress, String receiverAddress);
    void cancelOrder(String orderId);
    void queryOrder(String orderId);
}

