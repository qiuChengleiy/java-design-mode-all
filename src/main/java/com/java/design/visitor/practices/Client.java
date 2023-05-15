package com.java.design.visitor.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:54 AM 5/15/2023
 */
public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem("item1", 10.00, 2));
        cart.addItem(new CartItem("item2", 20.00, 1));
        cart.addItem(new CartItem("item3", 30.00, 3));

        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total price: " + totalPrice);

//        Visiting item1
//        Visiting item2
//        Visiting item3
//        Total price: 130.0
    }
}
