package com.amazon.ata.linkedlists;

import java.util.Collection;
import java.util.LinkedList;

/**
 * A ProfileableList implementation using a LinkedList.
 *
 * PARTICIPANTS: Implement all methods that throw UnsupportedOperationException in any order.
 */
public class ProfileableLinkedList implements ProfileableList {
    private LinkedList<Double> list = new LinkedList<>();

    @Override
    public String getListImplementationType() {
        return "LinkedList";
    }

    @Override
    public void addFirst(Double data) {
        list.addFirst(data);

//        throw new UnsupportedOperationException();
    }

    @Override
    public void addLast(Double data) {
        list.addLast(data);

//        throw new UnsupportedOperationException();
    }

    @Override
    public Double getFirst() {
        return list.getFirst();

//        throw new UnsupportedOperationException();
    }

    @Override
    public Double getMiddle() {
        int size = list.size() / 2;
        return list.get(size);

//        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public void addAll(Collection<Double> collection) {
        this.list.addAll(collection);
    }
}
