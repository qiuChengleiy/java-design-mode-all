package com.java.design.facade.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:44 AM 4/12/2023
 */
public class OrderFacade {
    private OrderValidator orderValidator;
    private OrderPayment orderPayment;
    private LogisticsService logisticsService;

    public OrderFacade() {
        orderValidator = new OrderValidator();
        orderPayment = new OrderPayment();
        logisticsService = new LogisticsService();
    }

    public void createOrder(Order order) {
        if (orderValidator.validate(order)) {
            orderPayment.pay(order);
            logisticsService.ship(order);
        } else {
            System.out.println("订单验证失败！");
        }
    }
}