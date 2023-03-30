package com.java.design.factory;

/**
 * @Author qcl
 * @Description 方法工厂模式
 * @Date 3:37 PM 3/29/2023
 */
public interface MethodFactory {
    public MethodProduct createProduct();
}

interface MethodProduct {

}

class ConcreteFactoryA implements MethodFactory {
    @Override
    public MethodProduct createProduct() {
        return new ProductA();
    }
}

class ConcreteFactoryB implements MethodFactory {
    @Override
    public MethodProduct createProduct() {
        return new ProductB();
    }
}

class ProductA implements MethodProduct {}
class ProductB implements MethodProduct {}