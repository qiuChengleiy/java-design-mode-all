package com.java.design.observer;

import java.util.ArrayList;

/**
 * @Author qcl
 * @Description
 * @Date 9:38 AM 4/26/2023
 */
public class CounterSubject implements Subject {
    private int value;
    private ArrayList<Observer> observers;

    public CounterSubject() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public void setValue(int newValue) {
        value = newValue;
        notifyObservers();
    }

    public int getValue() {
        return value;
    }
}
