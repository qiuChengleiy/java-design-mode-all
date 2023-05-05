package com.java.design.template;

/**
 * @Author qcl
 * @Description
 * @Date 9:15 AM 5/5/2023
 */
public abstract class AbstractClass {
    // 模版方法 templateMethod，定义算法骨架
    public final void templateMethod() {
        step1();
        step2();
        step3();
    }
    // 步骤1，抽象方法，由子类实现
    abstract void step1();
    // 步骤2，抽象方法，由子类实现
    abstract void step2();
    // 步骤3，抽象方法，由子类实现
    abstract void step3();
}
