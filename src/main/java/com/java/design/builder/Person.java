package com.java.design.builder;

/**
 * @Author qcl
 * @Description
 * @Date 9:43 AM 3/31/2023
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String occupation;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}

