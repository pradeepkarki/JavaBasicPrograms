package com.java.concepts.collections.set.hashset;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("ball");
        hashSet.add("cat");

        //Again add the duplicate element
        hashSet.add("ball");
        hashSet.add("cat");

        //Add null values
        hashSet.add(null);
        hashSet.add(null);

        //print hashset
        System.out.println(hashSet);

        //Print using iterator
        System.out.println("_______________print Using Iterator___________________");
        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //print using list iterator
        System.out.println("_______________print Using ForEach___________________");
        for (String str : hashSet) {
            System.out.println(str);
        }

        //Converting hashet to an array
        String[] arr = new String[hashSet.size()];
        System.out.println("_______________Convert hashset to array___________________");
        hashSet.toArray(arr);
        for (String str : arr) {
            System.out.println(str);
        }

        //converting hashset to arraylist
        System.out.println("_______________Convert hashset to arraylist___________________");
        // Creating a List of HashSet elements
        List<String> list = new ArrayList<String>(hashSet);

        // Displaying ArrayList elements
        System.out.println("ArrayList contains: " + list);

        //converting hashset to treset
        System.out.println("_______________Convert hashset to treeset___________________");
        Set<String> tSet = new TreeSet<>(hashSet);

        for (String str : tSet) {
            System.out.println(str);
        }


    }
}
