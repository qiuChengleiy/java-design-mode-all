package com.java.design.interpreter.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:45 AM 4/20/2023
 */
public class DiscountSystemDemo {
    public static void main(String[] args) {
        // 初始化购物车
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("001", "商品1", 100, 2));
        cart.addItem(new CartItem("002", "商品2", 200, 1));

        // 定义折扣规则
        DiscountExpression rule1 = new Discount(new ItemPrice("001"), new DiscountPrice(0.1));
        DiscountExpression rule2 = new Discount(new ItemPrice("002"), new DiscountPrice(0.2));

        // 计算折扣
        double discount1 = rule1.interpret(cart);
        double discount2 = rule2.interpret(cart);
        double totalDiscount = discount1 + discount2;

        // 输出结果
        System.out.println("折扣总额：" + totalDiscount);
        System.out.println("应付金额：" + (new CartTotal().interpret(cart) - totalDiscount));

//        折扣总额：120.0
//        应付金额：280.0
    }
}
