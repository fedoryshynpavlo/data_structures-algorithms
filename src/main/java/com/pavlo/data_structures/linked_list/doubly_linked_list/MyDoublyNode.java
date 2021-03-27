package com.pavlo.data_structures.linked_list.doubly_linked_list;

public class MyDoublyNode {

    private Object value;
    private MyDoublyNode previous;
    private MyDoublyNode next;

    public MyDoublyNode(Object value, MyDoublyNode previous, MyDoublyNode next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public MyDoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(MyDoublyNode previous) {
        this.previous = previous;
    }

    public MyDoublyNode getNext() {
        return next;
    }

    public void setNext(MyDoublyNode next) {
        this.next = next;
    }
}
