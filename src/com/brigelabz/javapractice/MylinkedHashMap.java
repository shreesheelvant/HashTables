package com.brigelabz.javapractice;

import java.util.ArrayList;

public class MylinkedHashMap {
    private final int numBuckets;
    ArrayList<MyLinkedList<K>> myBucketArray;


    public MylinkedHashMap(int numBuckets) {
        this.numBuckets = numBuckets;
        this.myBucketArray = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++)
            this.myBucketArray.add(null);

        private int getBucketIndex (K key)
        {
            int hashcode = Math.abs(key.hashCode());
            int index = hashcode % numBuckets;
            return index;
        }
    }
}

