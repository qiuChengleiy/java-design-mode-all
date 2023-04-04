package com.java.design.adapter.practices;

/**
 * @Author qcl
 * @Description 顺丰适配器
 * @Date 10:25 AM 4/4/2023
 */
public class SFExpressServiceAdapter implements LogisticsServiceAdapter {
    private SFExpressService sfExpressService;

    public SFExpressServiceAdapter(SFExpressService sfExpressService) {
        this.sfExpressService = sfExpressService;
    }

    @Override
    public void createOrder(String orderId, String senderAddress, String receiverAddress) {
        sfExpressService.createShipment(orderId, senderAddress, receiverAddress);
    }

    @Override
    public void cancelOrder(String orderId) {
        sfExpressService.cancelShipment(orderId);
    }

    @Override
    public void queryOrder(String orderId) {
        sfExpressService.queryShipment(orderId);
    }
}

