package com.java.design.strategy;

/**
 * @Author qcl
 * @Description
 * @Date 9:48 AM 5/4/2023
 */
public class OperationMultiply implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
