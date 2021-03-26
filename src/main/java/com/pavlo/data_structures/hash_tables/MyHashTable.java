package com.pavlo.data_structures.hash_tables;

public class MyHashTable {

    private int capacity;
    private Bucket<String, Integer>[] data;

    public MyHashTable(int capacity) {
        this.capacity = capacity;
        this.data = new Bucket[capacity];
    }

    public void add(String key, int val) {
        if (data[hash(key)] == null) {
            data[hash(key)] = new Bucket();
        }
        data[hash(key)] = new Bucket(key, val);
    }

    public int get(String key) {
        int val = 0;
        if (data[hash(key)] == null) {
            return val;
        }
       val = data[hash(key)].getVal();
        return val;
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % capacity;
        }
        return hash;
    }

    public static void main(String[] args) {
        MyHashTable table = new MyHashTable(3);
        table.add("ta", 1000);
        table.add("tu", 589);
        table.add("e", 10);
        System.out.println(table.get("ta"));
        System.out.println(table.get("tu"));
        System.out.println(table.get("e"));
    }
}
