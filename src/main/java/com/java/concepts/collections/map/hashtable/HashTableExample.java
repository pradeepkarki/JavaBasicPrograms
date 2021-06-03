package com.java.concepts.collections.map.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        //Hash Table -> it does not allow any null key or value
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, " a");
        ht.put(2, "b");
        ht.put(3, "c");
        ht.put(1, "4");
        ht.put(1, "4");

        /*
        iterating through a hash table
         */
        for (Map.Entry entry : ht.entrySet()) {
            System.out.println( entry.getKey()+"----"+
            entry.getValue());
        }
    }
}
