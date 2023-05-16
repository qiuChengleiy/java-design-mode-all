package com.java.design.dependency;

/**
 * @Author qcl
 * @Description
 * @Date 11:29 AM 5/16/2023
 */
public class UserService1Impl implements UserService {

    @Override
    public void sayHello() {
        System.out.println("Hello, userService1");
    }
}
