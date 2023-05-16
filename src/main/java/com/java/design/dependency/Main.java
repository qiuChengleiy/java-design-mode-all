package com.java.design.dependency;

/**
 * @Author qcl
 * @Description 依赖注入 + 控制反转
 * @Date 11:13 AM 5/16/2023
 */
public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        // 注册Java对象到IOC容器
        container.register("userService", BeanFactory.getBean("com.java.design.dependency.UserServiceImpl"));
        container.register("userService1", BeanFactory.getBean("com.java.design.dependency.UserService1Impl"));

        // 从IOC容器中获取Java对象并使用
        UserService userService = (UserService) container.getBean("userService");
        userService.sayHello();

        // Hello, userService1
    }
}
