package com.java.design.state;

/**
 * @Author qcl
 * @Description 状态模式
 * @Date 9:28 AM 4/27/2023
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.request();
        context.request();
        context.request();
        context.request();
//        当前状态是 A.
//        当前状态是 B.
//        当前状态是 A.
//        当前状态是 B.
    }
}
