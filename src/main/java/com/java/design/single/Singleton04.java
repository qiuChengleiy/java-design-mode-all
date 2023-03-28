package com.java.design.single;

/**
 * @Author qcl
 * @Description 枚举模式
 * @Date 10:47 AM 3/28/2023
 */
public enum Singleton04 {
    INSTANCE;

    private String message = "Hello World!";

    public void showMessage() {
        System.out.println(message);
    }
}
