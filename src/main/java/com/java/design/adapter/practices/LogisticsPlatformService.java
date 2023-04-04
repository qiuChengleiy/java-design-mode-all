package com.java.design.adapter.practices;

/**
 * @Author qcl
 * @Description 物流平台服务
 * @Date 10:33 AM 4/4/2023
 */
public class LogisticsPlatformService implements LogisticsService{

    private LogisticsServiceAdapter logisticsServiceAdapter;

    public LogisticsPlatformService(LogisticsServiceAdapter logisticsServiceAdapter) {
        this.logisticsServiceAdapter = logisticsServiceAdapter;
    }

    @Override
    public void createOrder(String orderId, String senderAddress, String receiverAddress) {
        logisticsServiceAdapter.createOrder(orderId, senderAddress, receiverAddress);
    }

    @Override
    public void cancelOrder(String orderId) {
        logisticsServiceAdapter.cancelOrder(orderId);
    }

    @Override
    public void queryOrder(String orderId) {
        logisticsServiceAdapter.queryOrder(orderId);
    }
}
