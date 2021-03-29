package com.pavlo.data_structures.stacks_queues.queues;

import java.util.Arrays;

public class MyArrQueue {

    private Object[] queue;
    private int length = 0;
    private int capacity = 1;

    public MyArrQueue() {
        this.queue = new Object[capacity];
    }

    public Object[] getQueue() {
        return queue;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Object peek() {
        return getQueue()[0];
    }

    public void enqueue(Object value) {
        if (length == capacity) {
            Object[] newArr = new Object[capacity * 2];
            for (int i = 0; i < length; i++) {
                newArr[i] = queue[i];
            }
            capacity *= 2;
            queue = newArr;
        }
        queue[length] = value;
        length++;
    }

    public void dequeue() {
        Object[] newArr = new Object[length];
        int j = 0;
        for(int i = 1; i < length; i++) {
            newArr[j] = queue[i];
            j++;
        }
        queue = newArr;
        length--;
    }

    @Override
    public String toString() {
        return "MyArrQueue{" + Arrays.toString(queue) + '}';
    }

    public static void main(String[] args) {
        MyArrQueue queue = new MyArrQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
    }
}
