package com.java.design.builder;

/**
 * @Author qcl
 * @Description 建造者模式
 * @Date 9:42 AM 3/31/2023
 */
public interface PersonBuilder {
    void createPerson();
    void setName(String name);
    void setAge(int age);
    void setGender(String gender);
    void setOccupation(String occupation);
    Person getPerson();
}

