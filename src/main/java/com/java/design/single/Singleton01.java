package com.java.design.single;

/**
 * @Author qcl
 * @Description 单例模式
 * @Date 9:50 AM 3/28/2023
 */
public class Singleton01 {
    private static Singleton01 instance;

    private Singleton01() {
        // 构造函数私有化，确保只能通过getInstance()方法获取实例
    }

    public static Singleton01 getInstance() {
        if (instance == null) {
            System.out.println("instance = null");
            instance = new Singleton01();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getInstance();
        System.out.println(singleton01.hashCode());

        Singleton01 singleton02 = Singleton01.getInstance();
        System.out.println(singleton02.hashCode());
        System.out.println(singleton01.equals(singleton02));
    }
}
