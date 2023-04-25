package com.java.design.memento.practices;

/**
 * @Author qcl
 * @Description 备忘录模式
 * @Date 9:29 AM 4/25/2023
 */
public class MementoPatternDemo {
    public static void main(String[] args) {
        // 创建购物车和管理者
        Cart cart = new Cart();
        Caretaker caretaker = new Caretaker();

        // 向购物车添加商品
        cart.addItem(new CartItem(1, 10));
        cart.addItem(new CartItem(2, 20));
        System.out.println("添加商品到购物车: ");
        cart.getItemList().forEach(item -> System.out.println(item.getId() + ": " + item.getCount()));

        // 保存购物车状态
        caretaker.saveStateToMemento(cart);

        // 向购物车添加新的商品
        cart.addItem(new CartItem(3, 30));
        System.out.println("再次添加商品到购物车: ");
        cart.getItemList().forEach(item -> System.out.println(item.getId() + ": " + item.getCount()));

        // 恢复购物车之前的状态
        caretaker.getStateFromMemento(cart);
        System.out.println("恢复购物车状态: ");
        cart.getItemList().forEach(item -> System.out.println(item.getId() + ": " + item.getCount()));
//        添加商品到购物车:
//        1: 10
//        2: 20
//        再次添加商品到购物车:
//        1: 10
//        2: 20
//        3: 30
//        恢复购物车状态:
//        1: 10
//        2: 20
    }
}
