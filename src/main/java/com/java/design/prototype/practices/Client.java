package com.java.design.prototype.practices;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date 11:02 AM 4/3/2023
 */
public class Client {
    public static void main(String[] args) {
        // 创建商品推荐原型对象
        ConcreteProductRecommendation prototype = new ConcreteProductRecommendation(5);

        // 根据用户历史记录生成推荐商品列表
        List<Product> userHistory = new ArrayList<>();
        userHistory.add(new Product("product1"));
        userHistory.add(new Product("product2"));
        userHistory.add(new Product("product3"));
        List<Product> recommendations = prototype.getRecommendations(userHistory);

        // 克隆原型对象并修改属性值
        ConcreteProductRecommendation clone = (ConcreteProductRecommendation) prototype.clone();
        clone.setMaxRecommendations(10);

        // 根据用户历史记录生成推荐商品列表
        List<Product> userHistory2 = new ArrayList<>();
        userHistory2.add(new Product("product4"));
        userHistory2.add(new Product("product5"));
        userHistory2.add(new Product("product6"));
        List<Product> recommendations2 = clone.getRecommendations(userHistory2);

        // 输出推荐商品列表
        System.out.println("Recommendations 1:");
        for (Product recommendation : recommendations) {
            System.out.println(recommendation.getName());
        }
        System.out.println("Recommendations 2:");
        for (Product recommendation : recommendations2) {
            System.out.println(recommendation.getName());
        }
    }
}


