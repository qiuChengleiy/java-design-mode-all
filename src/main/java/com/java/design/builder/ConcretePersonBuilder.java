package com.java.design.builder;

/**
 * @Author qcl
 * @Description
 * @Date 9:45 AM 3/31/2023
 */
public class ConcretePersonBuilder implements PersonBuilder {
    private Person person;

    @Override
    public void createPerson() {
        person = new Person();
    }

    @Override
    public void setName(String name) {
        person.setName(name);
    }

    @Override
    public void setAge(int age) {
        person.setAge(age);
    }

    @Override
    public void setGender(String gender) {
        person.setGender(gender);
    }

    @Override
    public void setOccupation(String occupation) {
        person.setOccupation(occupation);
    }

    @Override
    public Person getPerson() {
        return person;
    }
}

