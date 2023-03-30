package com.java.design.factory;

/**
 * @Author qcl
 * @Description 抽象工厂模式
 * @Date 9:44 AM 3/30/2023
 */
public interface AbstractFactory {
    AbsProductA createAbsProductA();
    AbsProductB createAbsProductB();
}

interface AbsProductA {}
interface AbsProductB {}

class ProductA1 implements AbsProductA{}
class ProductB1 implements AbsProductB{}

class ProductA2 implements AbsProductA{}
class ProductB2 implements AbsProductB{}

class AbsProductFactory1 implements AbstractFactory {

    @Override
    public AbsProductA createAbsProductA() {
        return new ProductA1();
    }

    @Override
    public AbsProductB createAbsProductB() {
        return new ProductB1();
    }
}

class AbsProductFactory2 implements AbstractFactory {

    @Override
    public AbsProductA createAbsProductA() {
        return new ProductA2();
    }

    @Override
    public AbsProductB createAbsProductB() {
        return new ProductB2();
    }
}

class AbsFactoryTest {
    public static void main(String[] args) {
        AbstractFactory fa1 = new AbsProductFactory1();
        AbsProductA p1a = fa1.createAbsProductA();
        AbsProductB p1b = fa1.createAbsProductB();

        AbstractFactory fa2 = new AbsProductFactory2();
        AbsProductA p2a = fa2.createAbsProductA();
        AbsProductB p2b = fa2.createAbsProductB();
    }
}
