package com.java.design.iterator.practices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author qcl
 * @Description
 * @Date 10:04 AM 4/21/2023
 */
public class OrderList implements Iterable<Order>  {
    private List<Order> orders;

    public OrderList() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public Iterator<Order> iterator() {
        return new OrderIterator();
    }

    private class OrderIterator implements Iterator<Order> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < orders.size();
        }

        @Override
        public Order next() {
            if (hasNext()) {
                Order order = orders.get(index);
                index++;
                return order;
            } else {
                throw new IndexOutOfBoundsException("No more orders to iterate");
            }
        }
    }
}
