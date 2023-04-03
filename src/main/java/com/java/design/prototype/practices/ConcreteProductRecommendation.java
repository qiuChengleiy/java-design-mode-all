package com.java.design.prototype.practices;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date 11:00 AM 4/3/2023
 */
public class ConcreteProductRecommendation implements ProductRecommendation {
    private int maxRecommendations;

    public ConcreteProductRecommendation(int maxRecommendations) {
        this.maxRecommendations = maxRecommendations;
    }

    public void setMaxRecommendations(int maxRecommendations) {
        this.maxRecommendations = maxRecommendations;
    }

    public ConcreteProductRecommendation(ConcreteProductRecommendation source) {
        this.maxRecommendations = source.maxRecommendations;
    }

    @Override
    public List<Product> getRecommendations(List<Product> userHistory) {
        // 根据用户历史记录生成推荐商品列表的具体实现
        // ...
        return userHistory;
    }

    @Override
    public ProductRecommendation clone() {
        return new ConcreteProductRecommendation(this);
    }

}

