package com.pavlo.data_structures.stacks_queues.queues;

public class MyNode {

    private Object value;
    private MyNode next;

    public MyNode(Object value, MyNode next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
