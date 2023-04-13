package com.java.design.flyweight.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:52 AM 4/13/2023
 */
public class Client {
    public static void main(String[] args) {
        Product p1 = ProductFactory.getProduct("iphone13", 7999.0, "128GB", "iphone13.png");
        Product p2 = ProductFactory.getProduct("iphone13", 7999.0, "128GB", "iphone13.png");
        Product p3 = ProductFactory.getProduct("MacBook Pro", 9999.0, "16GB", "macbook-pro.png");

        p1.showInfo();
        p2.showInfo();
        p3.showInfo();

        System.out.println("p1 == p2：" + (p1 == p2)); // true
//        名称：iphone13
//        价格：7999.0
//        描述：128GB
//        图片：iphone13.png
//        名称：iphone13
//        价格：7999.0
//        描述：128GB
//        图片：iphone13.png
//        名称：MacBook Pro
//        价格：9999.0
//        描述：16GB
//        图片：macbook-pro.png
//        p1 == p2：true
    }
}
