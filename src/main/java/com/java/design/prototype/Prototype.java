package com.java.design.prototype;

/**
 * @Author qcl
 * @Description 原型模式
 * @Date 10:36 AM 4/3/2023
 */
public interface Prototype {
    Prototype clone();
}

class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(name);
    }
}

class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("prototype");
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();

        System.out.println("Prototype: " + prototype.getName());
        System.out.println("Clone: " + clone.getName());
    }
}

