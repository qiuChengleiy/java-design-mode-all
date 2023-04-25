package com.java.design.memento.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:11 AM 4/25/2023
 */
public class CartItem {
    private Integer id;
    private Integer count;

    public CartItem(Integer id, Integer count) {
        this.id = id;
        this.count = count;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
