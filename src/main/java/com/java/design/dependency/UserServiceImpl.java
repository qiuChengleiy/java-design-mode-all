package com.java.design.dependency;

/**
 * @Author qcl
 * @Description
 * @Date 11:12 AM 5/16/2023
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserService userService1;

    @Override
    public void sayHello() {
        userService1.sayHello();
    }
}
