package edu.sdccd.cisc191;

import java.util.LinkedList;

public class GenericMatchQueue<T> {

    private final LinkedList<T> items = new LinkedList<>();

    public void enqueue(T item) {
        // add the item to the back of the queue
        items.add(item);
    }

    public T dequeue() {
        // remove and return the front item
        // throw IllegalStateException if the queue is empty
        if (items.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return items.remove();
    }

    public T peek() {
        // return the front item without removing it
        // throw IllegalStateException if the queue is empty
        if (items.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return items.peek();
    }

    public boolean isEmpty() {
        // return true when the queue has no items
        if (items.isEmpty()) {
            return true;
        }
        return false;
    }

    public int size() {
        return items.size();
    }
}
