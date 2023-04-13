package com.java.design.flyweight.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:52 AM 4/13/2023
 */
public class ConcreteProduct implements Product {
    private String name;
    private double price;
    private String description;
    private String image;

    public ConcreteProduct(String name, double price, String description, String image) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    @Override
    public void showInfo() {
        System.out.println("名称：" + name);
        System.out.println("价格：" + price);
        System.out.println("描述：" + description);
        System.out.println("图片：" + image);
    }
}
