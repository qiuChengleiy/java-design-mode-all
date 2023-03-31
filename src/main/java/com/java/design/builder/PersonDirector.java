package com.java.design.builder;

/**
 * @Author qcl
 * @Description 指挥官
 * @Date 9:46 AM 3/31/2023
 */
public class PersonDirector {
    private PersonBuilder builder;

    public PersonDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    public void constructPerson(String name, int age, String gender, String occupation) {
        builder.createPerson();
        builder.setName(name);
        builder.setAge(age);
        builder.setGender(gender);
        builder.setOccupation(occupation);
    }
}
