package com.java.design.observer;

/**
 * @Author qcl
 * @Description 观察者模式
 * @Date 9:41 AM 4/26/2023
 */
public class ObserverDemo {
    public static void main(String[] args) {
        CounterSubject subject = new CounterSubject();
        CounterObserver observer1 = new CounterObserver();
        CounterObserver observer2 = new CounterObserver();
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setValue(10); // Output: CounterObserver: Value changed to 10
        subject.setValue(20); // Output: CounterObserver: Value changed to 20
    }
}
