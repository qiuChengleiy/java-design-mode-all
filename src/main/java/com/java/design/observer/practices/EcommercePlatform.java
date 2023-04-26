package com.java.design.observer.practices;

import java.util.ArrayList;

/**
 * @Author qcl
 * @Description
 * @Date 9:50 AM 4/26/2023
 */
public class EcommercePlatform implements Subject {
    private ArrayList<Observer> observers;
    public EcommercePlatform() {
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    public void notifyUsers(String message) {
        notifyObservers(message);
    }
}
