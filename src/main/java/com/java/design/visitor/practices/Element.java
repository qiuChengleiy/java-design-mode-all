package com.java.design.visitor.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:36 AM 5/15/2023
 */
public interface Element {
    void accept(Visitor visitor);
}
