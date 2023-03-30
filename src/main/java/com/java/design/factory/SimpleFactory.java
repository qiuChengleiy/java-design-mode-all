package com.java.design.factory;

/**
 * @Author qcl
 * @Description 简单工厂
 * @Date 3:29 PM 3/29/2023
 */
class SimpleFactory {
    public static Product createProduct(String type) {
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else if (type.equals("B")) {
            return new ConcreteProductB();
        } else {
            return null;
        }
    }
}

interface Product {
}

class ConcreteProductA implements Product {

}

class ConcreteProductB implements Product {

}
