package com.java.design.observer.practices;

/**
 * @Author qcl
 * @Description
 * @Date 9:49 AM 4/26/2023
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
