package com.java.design.single;

import java.lang.reflect.Constructor;

/**
 * @Author qcl
 * @Description 反射攻击
 * @Date 10:53 AM 3/28/2023
 */
public class Singleton05 {
    private static Singleton05 instance = new Singleton05();

    private Singleton05() {
        if (instance != null) {
            throw new IllegalStateException("Singleton already initialized");
        }
    }

    public static Singleton05 getInstance() {
        return instance;
    }

    public static void main(String[] args) throws Exception {
        Constructor<Singleton05> constructor = Singleton05.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton05 instance1 = constructor.newInstance();
        Singleton05 instance2 = Singleton05.getInstance();
        System.out.println(instance1 == instance2);

//        Exception in thread "main" java.lang.reflect.InvocationTargetException
//        at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
//        at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
//        at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
//        at java.lang.reflect.Constructor.newInstance(Constructor.java:423)
//        at com.java.design.single.Singleton05.main(Singleton05.java:26)
//        Caused by: java.lang.IllegalStateException: Singleton already initialized
//        at com.java.design.single.Singleton05.<init>(Singleton05.java:15)
//	... 5 more
    }
}
