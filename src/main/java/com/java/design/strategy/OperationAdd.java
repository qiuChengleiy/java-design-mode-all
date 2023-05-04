package com.java.design.strategy;

/**
 * @Author qcl
 * @Description
 * @Date 9:47 AM 5/4/2023
 */
public class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
