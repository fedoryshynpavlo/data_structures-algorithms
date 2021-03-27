package com.pavlo.data_structures.linked_list;

import java.util.Arrays;

public class MyLinkedList {

    private int length;
    private MyNode head;
    private MyNode tail;

    public MyLinkedList(Object value) {
        this.head = new MyNode(value, null);
        this.tail = head;
        this.length = 1;
    }

    public void append(Object value) {
        MyNode myNode = new MyNode(value, null);
        tail.setNext(myNode);
        tail = myNode;
        length++;
    }

    public void prepend(Object value) {
        head = new MyNode(value, head);
        length++;
    }

    public void insert(int index, Object value) {
        if (index == 0) {
            prepend(value);
            return;
        }
        if (index == length - 1) {
            append(value);
            return;
        }
        MyNode current = getNode(index - 1);
        MyNode newNode = new MyNode(value, current.getNext());
        current.setNext(newNode);
        length++;
    }

    private MyNode getNode(int index) {
        MyNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    @Override
    public String toString() {
        MyNode current = head;
        Object[] values = new Object[length];
        for (int i = 0; i < length; i++) {
            if(current.getValue() != null) {
                values[i] = current.getValue();
            }
            current = current.getNext();
        }
        return Arrays.toString(values);
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.append(13);
        myLinkedList.append(14);
        myLinkedList.prepend(1);
        System.out.println(myLinkedList);
        myLinkedList.insert(3, 20);
        System.out.println(myLinkedList);
    }
}
