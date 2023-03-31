package com.java.design.builder;

/**
 * @Author qcl
 * @Description
 * @Date 9:49 AM 3/31/2023
 */
public class BuilderTest {
    public static void main(String[] args) throws Exception {
        PersonBuilder builder = new ConcretePersonBuilder();
        PersonDirector director = new PersonDirector(builder);
        director.constructPerson("张三", 20, "男", "学生");
        Person person = builder.getPerson();
        System.out.println(person.toString());
        // Person{name='张三', age=20, gender='男', occupation='学生'}
    }
}
