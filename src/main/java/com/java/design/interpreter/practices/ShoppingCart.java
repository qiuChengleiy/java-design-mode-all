package com.java.design.interpreter.practices;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qcl
 * @Description 环境：购物车
 * @Date 9:45 AM 4/20/2023
 */
public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public List<CartItem> getItems() {
        return items;
    }
}
