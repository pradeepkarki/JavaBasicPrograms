package com.java.concepts.collections.map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        /* This is how to declare HashMap */
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");

        System.out.println("___________________Print Map Elements using iterator______________________");
        Set<Map.Entry<Integer, String>> entrySet = hmap.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
        while(itr.hasNext())
        {
            Map.Entry<Integer, String> mentry = itr.next();
            System.out.println(mentry.getKey());;
            System.out.println(mentry.getValue());;
        }

        //FOR LOOP
        System.out.println("For Loop:");
        for (Map.Entry me : hmap.entrySet()) {
            System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

        //WHILE LOOP & ITERATOR
        System.out.println("While Loop:");
        Iterator iterator = hmap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator.next();
            System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        }

    }
}
