package com.java.design.single;

/**
 * @Author qcl
 * @Description 双重校验锁 (线程安全)
 * @Date 10:16 AM 3/28/2023
 */
public class Singleton02 {
    private volatile static Singleton02 instance;

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        if (instance == null) {
            synchronized (Singleton02.class) {
                if (instance == null) {
                    instance = new Singleton02();
                }
            }
        }
        return instance;
    }
}
