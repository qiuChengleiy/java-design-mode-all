package com.java.design.single;

/**
 * @Author qcl
 * @Description 静态内部类
 * @Date 10:37 AM 3/28/2023
 */
public class Singleton03 {
    private Singleton03() {
    }

    private static class Singleton {
        private static final Singleton03 INSTANCE = new Singleton03();
    }

    public static Singleton03 getInstance() {
        return Singleton.INSTANCE;
    }
}
