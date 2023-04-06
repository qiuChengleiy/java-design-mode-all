package com.java.design.bridge.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:04 AM 4/6/2023
 */
public class OnlineOrderProcessor extends OrderProcessor {
    @Override
    public void processNormalOrder() {
        System.out.println("在线订单处理普通订单");
    }

    @Override
    public void processRushOrder() {
        System.out.println("在线订单处理加急订单");
    }
}
