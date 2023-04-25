package com.java.design.memento.practices;

/**
 * @Author qcl
 * @Description
 * @Date 10:11 AM 4/25/2023
 */
public class Caretaker {
    private CartMemento cartMemento;
    public void saveStateToMemento(Cart cart) {
        cartMemento = cart.saveToMemento();
    }
    public void getStateFromMemento(Cart cart) {
        cart.restoreFromMemento(cartMemento);
    }
}
