package com.java.design.interpreter.practices;

/**
 * @Author qcl
 * @Description 终结符表达式：商品价格
 * @Date 9:44 AM 4/20/2023
 */
public class ItemPrice implements DiscountExpression {
    private String itemId;

    public ItemPrice(String itemId) {
        this.itemId = itemId;
    }

    public double interpret(ShoppingCart cart) {
        double price = 0;
        for (CartItem item : cart.getItems()) {
            if (item.getItemId().equals(itemId)) {
                price += item.getPrice() * item.getQuantity();
            }
        }
        return price;
    }
}
