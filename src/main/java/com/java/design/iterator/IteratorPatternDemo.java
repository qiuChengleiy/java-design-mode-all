package com.java.design.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author qcl
 * @Description 迭代器模式
 * @Date 10:03 AM 4/21/2023
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Mike");
        names.add("Sarah");

        Iterator<String> iter = names.iterator();
        while(iter.hasNext()) {
            String name = iter.next();
            System.out.println("Name: " + name);
        }
    }
}
