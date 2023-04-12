package com.java.design.facade;

/**
 * @Author qcl
 * @Description
 * @Date 9:41 AM 4/12/2023
 */
class OrderFacade {
    private UserService userService;
    private OrderService orderService;
    private InventoryService inventoryService;

    public OrderFacade() {
        userService = new UserService();
        orderService = new OrderService();
        inventoryService = new InventoryService();
    }

    // 订单流程
    public void order() {
        userService.addUser();
        orderService.addOrder();
        inventoryService.deductStock();
    }
}
