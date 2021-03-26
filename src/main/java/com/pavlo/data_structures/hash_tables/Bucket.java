package com.pavlo.data_structures.hash_tables;

public class Bucket<K, V> {

    private K key;
    private V val;

    public Bucket(K key, V val) {
        this.key = key;
        this.val = val;
    }

    public Bucket() {
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }
}
