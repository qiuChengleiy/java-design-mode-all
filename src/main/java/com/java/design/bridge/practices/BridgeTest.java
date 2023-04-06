package com.java.design.bridge.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:56 AM 4/6/2023
 */
public class BridgeTest {
    public static void main(String[] args) throws Exception {
        OrderProcessor onlineOrderProcessor = new OnlineOrderProcessor();
        OrderProcessor offlineOrderProcessor = new OfflineOrderProcessor();

        Order normalOnlineOrder = new NormalOrder(onlineOrderProcessor);
        Order rushOnlineOrder = new RushOrder(onlineOrderProcessor);
        Order normalOfflineOrder = new NormalOrder(offlineOrderProcessor);
        Order rushOfflineOrder = new RushOrder(offlineOrderProcessor);

        normalOnlineOrder.process();
        rushOnlineOrder.process();
        normalOfflineOrder.process();
        rushOfflineOrder.process();
    }
}
