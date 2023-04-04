package com.java.design.adapter.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:35 AM 4/4/2023
 */
public class LogisticsPlatformServiceTest {
    public static void main(String[] args) throws Exception {
        SFExpressService sfExpressService = new SFExpressService();
        LogisticsServiceAdapter sfAdapter = new SFExpressServiceAdapter(sfExpressService);
        LogisticsService service = new LogisticsPlatformService(sfAdapter);
        service.cancelOrder("顺带订单取消");
    }
}
