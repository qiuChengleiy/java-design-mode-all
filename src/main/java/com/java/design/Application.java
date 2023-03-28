package com.java.design;

import com.java.design.single.Singleton04;

/**
 * @Author qcl
 * @Description
 * @Date 9:49 AM 3/28/2023
 */
public class Application {
    public static void main(String[] args) {
        Singleton04.INSTANCE.showMessage();
    }
}
