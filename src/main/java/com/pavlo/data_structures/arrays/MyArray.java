package com.pavlo.data_structures.arrays;

import java.util.Arrays;

public class MyArray<T> {

    private int length;
    private int capacity;
    private T[] data;

    public MyArray() {
        this.length = 0;
        this.capacity = 1;
        this.data = (T[]) new Object[1];
    }

    public Object get(int index) {
       return data[index];
    }

    public void add(T item) {
        if(length == capacity) {
            data = Arrays.copyOf(data, capacity*2);
            capacity *= 2;
        }
        data[length] = item;
        length++;
    }

    public void delete() {
        data[length - 1] = null;
        length--;
    }

    public void delete(int index) {
        for(int i = index; i < data.length - 1; i++) {
           data[i] = data[i + 1];
        }
        data[length - 1] = null;
        length--;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "length=" + length +
                ", capacity=" + capacity +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(2);
        myArray.delete(1);
        System.out.println(myArray);
    }
}
