package com.java.design.single;

import java.io.*;

/**
 * @Author qcl
 * @Description 序列化攻击
 * @Date 11:01 AM 3/28/2023
 */
public class Singleton06 implements Serializable {
    private static final long serialVersionUID = 1L;

    private static Singleton06 instance = new Singleton06();

    private Singleton06() {
        if (instance != null) {
            throw new IllegalStateException("Singleton already initialized");
        }
    }

    public static Singleton06 getInstance() {
        return instance;
    }

    // 保护措施
    protected Object readResolve() {
        return instance;
    }

    public static void main(String[] args) throws Exception {
        Singleton06 instance1 = Singleton06.getInstance();

        // 将实例对象序列化到文件中
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instance1);
        out.close();

        // 从文件中反序
        // 从文件中反序列化出实例对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton06 instance2 = (Singleton06) in.readObject();
        in.close();

        System.out.println(instance1 == instance2); // true
    }
}
