package com.pavlo.data_structures.linked_list.doubly_linked_list;

import java.util.Arrays;

public class MyDoublyLinkedList {

    private int length;
    private MyDoublyNode head;
    private MyDoublyNode tail;

    public MyDoublyLinkedList(Object value) {
        this.length = 1;
        this.head = new MyDoublyNode(value, null, null);
        this.tail = head;
    }

    public void append(Object value) {
        MyDoublyNode myNode = new MyDoublyNode(value, head.getPrevious(), null);
        tail.setNext(myNode);
        tail = myNode;
        length++;
    }

    public void prepend(Object value) {
        head = new MyDoublyNode(value, null, head);
        length++;
    }

    public void insert(int index, Object value) {
        MyDoublyNode current = getNode(index - 1);
        MyDoublyNode nodeToAdd = new MyDoublyNode(value, current, current.getNext());
        current.setNext(nodeToAdd);
        length++;
    }

    public void delete(int index) {
        MyDoublyNode current = getNode(index - 1);
        MyDoublyNode nodeToDelete = current.getNext();
        current.setNext(nodeToDelete.getNext());
        length--;
    }

    public MyDoublyNode getNode(int index) {
        MyDoublyNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node;
    }

    public void reverse() {
        MyDoublyNode first = head;
        tail = head;
        MyDoublyNode second = first.getNext();
        for (int i = 0; i < length - 1; i++) {
            MyDoublyNode temp = second.getNext();
            second.setNext(first);
//            second.setPrevious(temp);
            first = second;
            second = temp;
        }
        head.setNext(null);
        head = first;
    }

    @Override
    public String toString() {
        MyDoublyNode current = head;
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
        MyDoublyLinkedList myList = new MyDoublyLinkedList(1);
        myList.append(2);
        myList.prepend(3);
        myList.prepend(4);
        System.out.println(myList);
        myList.insert(2, 55);
        System.out.println(myList);
        myList.delete(2);
        System.out.println(myList);
        myList.reverse();
        System.out.println("Reversed: " + myList);
    }
}
