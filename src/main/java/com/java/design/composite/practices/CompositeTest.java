package com.java.design.composite.practices;

/**
 * @Author qcl
 * @Description 组合模式
 * @Date 10:07 AM 4/7/2023
 */
public class CompositeTest {
    public static void main(String[] args) throws Exception {
        CompositeProduct root = new CompositeProduct("欧莱雅套装");
        Product product1 = new SingleProduct("欧莱雅洗面奶", 188.00);
        Product product2 = new SingleProduct("欧莱雅洗面霜", 288.00);
        Product product3 = new SingleProduct("欧莱雅爽肤水", 168.00);

        root.addProduct(product1);
        root.addProduct(product2);
        root.addProduct(product3);

        System.out.println(root.getName());
        System.out.println(root.getPrice());
    }
}
