package com.java.design.observer;

/**
 * @Author qcl
 * @Description 主题接口
 * @Date 9:38 AM 4/26/2023
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
