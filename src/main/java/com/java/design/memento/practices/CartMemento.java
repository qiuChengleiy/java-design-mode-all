package com.java.design.memento.practices;

import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date 10:10 AM 4/25/2023
 */
public class CartMemento {
    private List<CartItem> itemList;
    public CartMemento(List<CartItem> itemList) {
        this.itemList = itemList;
    }
    public List<CartItem> getItemList() {
        return itemList;
    }
}
