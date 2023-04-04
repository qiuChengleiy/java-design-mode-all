package com.java.design.adapter.practices;

/**
 * @Author qcl
 * @Description 电商平台需要的物流服务功能接口
 * @Date 10:20 AM 4/4/2023
 */
public interface LogisticsService {
    void createOrder(String orderId, String senderAddress, String receiverAddress);
    void cancelOrder(String orderId);
    void queryOrder(String orderId);
}

