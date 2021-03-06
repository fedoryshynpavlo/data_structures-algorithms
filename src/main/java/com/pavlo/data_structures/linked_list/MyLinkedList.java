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
        if (index >= length - 1) {
            append(value);
            return;
        }
        MyNode current = getNode(index - 1);
        MyNode newNode = new MyNode(value, current.getNext());
        current.setNext(newNode);
        length++;
    }

    public void delete(int index) {
        MyNode current = getNode(index - 1);
        MyNode nodeToRemove = current.getNext();
        current.setNext(nodeToRemove.getNext());
        length--;
    }

    private MyNode getNode(int index) {
        MyNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    public void reverse() {
        MyNode firstNode = head;
        tail = head;
        MyNode nextNode = firstNode.getNext();
        for (int i = 0; i < length - 1; i++) {
            MyNode temp = nextNode.getNext();
            nextNode.setNext(firstNode);
            firstNode = nextNode;
            nextNode = temp;
        }
        head.setNext(null);
        head = firstNode;
    }

    @Override
    public String toString() {
        MyNode current = head;
        Object[] values = new Object[length];
        for (int i = 0; i < length; i++) {
            if (current != null) {
                values[i] = current.getValue();
                current = current.getNext();
            }
        }
        return Arrays.toString(values);
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.append(13);
        myLinkedList.append(14);
        myLinkedList.prepend(1);
        System.out.println(myLinkedList);
        myLinkedList.insert(1, 20);
        System.out.println(myLinkedList);
        myLinkedList.insert(4, 99);
        myLinkedList.insert(5, 199);
        myLinkedList.delete(1);
        myLinkedList.delete(5);
        System.out.println("initial: " + myLinkedList);
        myLinkedList.reverse();
        System.out.println("Reversed: " + myLinkedList);
    }
}
