package com.pavlo.data_structures.stacks_queues.stack;

import java.util.Arrays;

public class MyLListStack {

    private int length = 0;
    private MyNode top;
    private MyNode bottom;

    public MyLListStack() {
        this.top = null;
        this.bottom = null;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public MyNode getTop() {
        return top;
    }

    public Object peek() {
        if(length == 0) {
            throw new RuntimeException("Stack is Empty!");
        } else {
          return getTop().getValue();
        }
    }

    public void push(Object value) {
        if(length == 0) {
            top = new MyNode(value, null);
        } else {
            bottom = top;
            top = new MyNode(value, bottom);
        }
        length++;
    }

    public void pop() {
        MyNode newTop = top.getNext();
        top = new MyNode(newTop.getValue(), newTop.getNext());
        bottom = newTop.getNext();
        length--;
    }

    @Override
    public String toString() {
        Object arr[] = new Object[length];
        MyNode node = top;
        for(int i = 0; i < length; i++){
            arr[i] = node.getValue();
            node = node.getNext();
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        MyLListStack stack = new MyLListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
