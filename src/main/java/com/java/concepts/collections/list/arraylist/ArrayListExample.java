package com.java.concepts.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        //Insert the value
        arrayList.add("learn");
        arrayList.add("java");
        arrayList.add("collection");

        //print using for each
        System.out.println("Printing using for each");
        //printArrayListUsingForEach(arrayList);


        //print using iterator
        System.out.println("Print using Iterator");
        //printArrayListUsingIterator(arrayList);

        //print using iterator
        System.out.println("Print using List Iterator");
        printArrayListUsingListIterator(arrayList);

        //setting value by replacing
        arrayList.set(1,"python");

        //Adding to the index
        arrayList.add(1,"java");

        System.out.println(arrayList);


    }

    private static void printArrayListUsingListIterator(List<String> arrayList) {

        ListIterator<String> listItr = arrayList.listIterator();
        while(listItr.hasNext())
        {
            System.out.println(listItr.next());
        }
    }

    private static void printArrayListUsingIterator(List<String> arrayList) {

        Iterator<String> itr = arrayList.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

    private static void printArrayListUsingForEach(List<String> arrayList) {
        for (String str : arrayList)
        {
            System.out.println(str);
        }
    }

}
