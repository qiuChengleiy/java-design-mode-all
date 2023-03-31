package com.java.design.builder.busi;

import java.math.BigDecimal;

/**
 * @Author qcl
 * @Description
 * @Date 10:03 AM 3/31/2023
 */
public interface ProductBuilder {
    Product build();
    void setName(String name);
    void setDescription(String description);
    void setPrice(BigDecimal price);
    void setStock(int stock);
    void setBrand(String brand);
    void setCategory(String category);
}

