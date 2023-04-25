package com.java.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date 9:28 AM 4/25/2023
 */
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
