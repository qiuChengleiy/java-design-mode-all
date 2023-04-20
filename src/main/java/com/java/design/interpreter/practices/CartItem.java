package com.java.design.interpreter.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:45 AM 4/20/2023
 */
public class CartItem {
    private String itemId;
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
