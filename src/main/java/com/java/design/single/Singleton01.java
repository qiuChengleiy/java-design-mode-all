package com.java.design.single;

/**
 * @Author qcl
 * @Description 单例模式
 * @Date 9:50 AM 3/28/2023
 */
public class Singleton01 {

    // 懒汉式
    private static Singleton01 instance;

    // 饿汉式
    //private static Singleton01 instance = new Singleton01();

    private Singleton01() {
        // 构造函数私有化，确保只能通过getInstance()方法获取实例
    }


    public static synchronized  Singleton01 getInstance() {
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
