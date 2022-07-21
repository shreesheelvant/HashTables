package com.brigelabz.javapractice;

public class MyMapNode {
    K key;
    V value;
    MyMapNode<K,V> next;
    public MyMapNode(K key, V value) {...}
    public K getKey() { return key; }
    public void setKey(K key) { this.key = key;}
    public MyMapNode getNext() { return next; }
    public void setValue(V value) { this.value = value; }
    public String toString() {...}

}
