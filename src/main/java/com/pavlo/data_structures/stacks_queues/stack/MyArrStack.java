package com.pavlo.data_structures.stacks_queues.stack;

import java.util.Arrays;

public class MyArrStack {

    private Object[] nodes;
    private int length = 0;
    private int capacity = 1;

    public MyArrStack() {
        this.nodes = new Object[capacity];
    }

    public Object[] getNodes() {
        return nodes;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void push(Object value) {
        Object[] newArr = new Object[capacity * 2];
        if (length == capacity) {
            for (int i = 0; i < length; i++) {
                newArr[i] = nodes[i];
            }
            capacity *= 2;
            nodes = newArr;
        }
        nodes[length] = value;
        length++;
    }

    public Object peek() {
        if (length == 0) {
            throw new RuntimeException("Stack is Empty!");
        } else {
            return nodes[length - 1];
        }
    }

    public Object pop() {
        Object[] arr = new Object[length - 1];
        Object toRemove = nodes[length - 1];
        int j = 0;
        for (int i = 0; i < length - 1 ; i++) {
            arr[j] = nodes[i];
            j++;
        }
        nodes = arr;
        length--;
        return toRemove;
    }

    @Override
    public String toString() {
        return "MyArrStack: " + Arrays.toString(nodes);
    }

    public static void main(String[] args) {
        MyArrStack stack = new MyArrStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
