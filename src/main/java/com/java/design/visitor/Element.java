package com.java.design.visitor;

/**
 * @Author qcl
 * @Description
 * @Date 9:28 AM 5/15/2023
 */
public interface Element {
    void accept(Visitor visitor);
    String operation();
}
