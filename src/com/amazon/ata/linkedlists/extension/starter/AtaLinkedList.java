package com.amazon.ata.linkedlists.extension.starter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.amazon.ata.linkedlists.ProfileableList;

/**
 * PARTICIPANTS: This is a partial implementation of the AtaLinkedList.
 *
 * Feel free to continue building off of this or use it as a guide for your
 * own implementation.
 */
public class AtaLinkedList implements ProfileableList {
    private AtaNode head;
    private AtaNode tail;
    private int size;

    public AtaLinkedList() {
        this.size = 0;
    }

    public AtaLinkedList(Double data) {
        this.head = new AtaNode(data, null);
        this.tail = head;
        this.size = 1;
    }

    @Override
    public String getListImplementationType() {
        return "AtaLinkedList";
    }

    @Override
    public void addFirst(final Double data) {
        // Create a new node with the given data and the current head as the next node
        AtaNode newNode = new AtaNode(data, this.head);

        // Update the head to point to the new node
        this.head = newNode;

        // If the list was previously empty, update the tail to also point to the new node
        if (this.tail == null) {
            this.tail = newNode;
        }

        // Increment the size of the list
        this.size++;


//        throw new UnsupportedOperationException();
    }

    @Override
    public void addLast(final Double data) {
        AtaNode ataNode = new AtaNode(data, null);

        if (this.head == null) {
            this.head = ataNode;
            this.tail = head;
        } else {
            this.tail.setNext(ataNode);
            this.tail = this.tail.getNext();
        }
        this.size++;
    }

    @Override
    public Double getFirst() {
        return head.getData();

//        throw new UnsupportedOperationException();
    }

    @Override
    public Double getMiddle() {
        if (this.head == null) {
            // List is empty, handle this case as needed
            return null;  // Return null if the list is empty
            // Alternatively, you could throw an exception:
            // throw new NoSuchElementException("The list is empty.");
        }

        // Initialize two pointers: slow and fast
        AtaNode slowPointer = this.head;
        AtaNode fastPointer = this.head;

        // Move fastPointer twice as fast as slowPointer
        while (fastPointer != null && fastPointer.getNext() != null) {
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext().getNext();
        }

        // When fastPointer reaches the end, slowPointer will be at the middle
        return slowPointer.getData();
    }

    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void addAll(final Collection<Double> collection) {
        for (Double data : collection) {
            addLast(data);
        }
    }

    public int size() {
        return this.size;
    }

    public List<AtaNode> getAll() {
        List<AtaNode> ataNodes = new ArrayList<>();
        AtaNode pointer = head;
        do {
            ataNodes.add(pointer);
            pointer = pointer.getNext();
        } while (pointer != null);

        return ataNodes;
    }
}
