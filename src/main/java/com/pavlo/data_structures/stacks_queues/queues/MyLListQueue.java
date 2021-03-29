package com.pavlo.data_structures.stacks_queues.queues;

import java.util.Arrays;

public class MyLListQueue {

    private MyNode first;
    private MyNode last;
    private int length = 0;

    public MyLListQueue() {
        this.first = null;
        this.last = null;
    }

    public Object peek() {
        return first.getValue();
    }

    public void enqueue(Object value) {
        MyNode newNode = new MyNode(value, null);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        length++;
    }

    public void dequeue() {
        first = new MyNode(first.getNext().getValue(), first.getNext().getNext());
        length--;
    }

    @Override
    public String toString() {
        Object[] arr = new Object[length];
        MyNode node = first;
        for (int i = 0; i < length; i++) {
            arr[i] = node.getValue();
            node = node.getNext();
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        MyLListQueue queue = new MyLListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
    }
}
