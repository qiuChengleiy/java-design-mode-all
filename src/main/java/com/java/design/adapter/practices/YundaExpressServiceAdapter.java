package com.java.design.adapter.practices;

/**
 * @Author qcl
 * @Description 韵达适配器
 * @Date 10:26 AM 4/4/2023
 */
public class YundaExpressServiceAdapter implements LogisticsServiceAdapter {
    private YundaExpressService yundaService;

    public YundaExpressServiceAdapter(YundaExpressService yundaService) {
        this.yundaService = yundaService;
    }

    @Override
    public void createOrder(String orderId, String senderAddress, String receiverAddress) {
        yundaService.createOrder(orderId, senderAddress, receiverAddress);
    }

    @Override
    public void cancelOrder(String orderId) {
        yundaService.cancelOrder(orderId);
    }

    @Override
    public void queryOrder(String orderId) {
        yundaService.getOrderStatus(orderId);
    }
}
