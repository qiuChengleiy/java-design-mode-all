package com.java.design.prototype.practices;

import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date 10:59 AM 4/3/2023
 */
public interface ProductRecommendation {
    List<Product> getRecommendations(List<Product> userHistory);
    ProductRecommendation clone();
}
