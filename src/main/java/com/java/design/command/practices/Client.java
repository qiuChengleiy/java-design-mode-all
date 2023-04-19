package com.java.design.command.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:40 AM 4/19/2023
 */
public class Client {
    public static void main(String[] args) {
        // 创建订单对象
        Order order = new Order();

        // 创建具体命令对象并设置其接收者
        OrderCommand createOrderCommand = new CreateOrderCommand(order);
        OrderCommand cancelOrderCommand = new CancelOrderCommand(order);
        OrderCommand payOrderCommand = new PayOrderCommand(order);

        // 创建订单处理器对象并设置其命令
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addCommand(createOrderCommand);
        orderProcessor.addCommand(cancelOrderCommand);
        orderProcessor.addCommand(payOrderCommand);

        // 处理命令
        orderProcessor.processCommands();

        // 输出订单状态
        System.out.println("订单状态: " + order.getStatus());

        // 撤销最后一个命令
        orderProcessor.undoLastCommand();

        // 输出订单状态
        System.out.println("撤销后订单状态: " + order.getStatus());

//        订单创建成功
//                订单取消成功
//        订单支付成功
//        订单状态: Paid
//        撤销后订单状态: Paid
    }

}
