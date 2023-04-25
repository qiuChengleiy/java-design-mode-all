package com.java.design.memento.practices;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date 10:11 AM 4/25/2023
 */
public class Cart {
    private List<CartItem> itemList;
    public Cart() {
        itemList = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        itemList.add(item);
    }

    public List<CartItem> getItemList() {
        return itemList;
    }

    public void removeItem(CartItem item) {
        itemList.remove(item);
    }
    public void updateItem(CartItem item) {
        for (CartItem cartItem : itemList) {
            if(cartItem.getId() == item.getId()) {
                cartItem.setCount(item.getCount());
                break;
            }
        }
    }
    public CartMemento saveToMemento() {
        return new CartMemento(new ArrayList<>(itemList));
    }
    public void restoreFromMemento(CartMemento memento) {
        itemList = memento.getItemList();
    }
}
