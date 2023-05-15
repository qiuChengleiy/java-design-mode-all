package com.java.design.visitor.practices;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date 9:37 AM 5/15/2023
 */
public class ShoppingCart implements Visitor {
    private List<CartItem> items = new ArrayList<CartItem>();

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }

    public void visit(CartItem item) {
        // 计算购物车中商品的总价
        System.out.println("Visiting " + item.getName());
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (CartItem item : items) {
            item.accept(this);
            totalPrice += item.getPrice() * item.getQuantity();
        }
        return totalPrice;
    }
}

