package com.java.design.observer.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:51 AM 4/26/2023
 */
public class Demo {
    public static void main(String[] args) {
        EcommercePlatform ecommercePlatform = new EcommercePlatform();
        User user1 = new User("小明");
        User user2 = new User("小红");
        ecommercePlatform.registerObserver(user1);
        ecommercePlatform.registerObserver(user2);

        ecommercePlatform.notifyUsers("New products on sale!");
//        User 小明 received message: New products on sale!
//        User 小红 received message: New products on sale!
    }
}
