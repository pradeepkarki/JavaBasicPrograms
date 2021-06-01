package com.java.concepts.collections.list.arraylist;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        //Insert the value
        arrayList.add("learn");
        arrayList.add("java");
        arrayList.add("collection");
        arrayList.add("with example");

        //print using for each
        System.out.println("Printing using for each");
        //printArrayListUsingForEach(arrayList);


        //print using iterator
        System.out.println("Print using Iterator");
        //printArrayListUsingIterator(arrayList);

        //print using iterator
        System.out.println("Print using List Iterator");
        printArrayListUsingListIterator(arrayList, "FORWARD");


        //print using iterator
        System.out.println("Print using enumeration");
        printArrayListUsingEnumeration(arrayList);


        //setting value by replacing
        arrayList.set(1, "python");

        //Adding to the index
        arrayList.add(1, "java");

        //remove by index
        arrayList.remove(0);

        //Remove by value
        arrayList.remove("java");

        arrayList.set(1, "java");

        System.out.println(arrayList);

        //subList example
        getSublistOfArrayList(arrayList);

    }

    private static void getSublistOfArrayList(List<String> arrayList) {

        System.out.println("SubList example");
        List<String> subList = arrayList.subList(1, 3);
        System.out.println(subList);
    }

    /**
     * print using ennumeratio
     *
     * @param arrayList - arraylist
     */
    private static void printArrayListUsingEnumeration(List<String> arrayList) {

        Enumeration<String> en = Collections.enumeration(arrayList);

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

    }

    /**
     * print using ListIterator
     *
     * @param arrayList - arraylist
     */
    private static void printArrayListUsingListIterator(List<String> arrayList, String direction) {

        switch (direction) {
            case "FORWARD":
                ListIterator<String> listItr = arrayList.listIterator();
                while (listItr.hasNext()) {
                    System.out.println(listItr.next());
                }
                break;
            case "BACKWARD":
                ListIterator<String> lItr = arrayList.listIterator();
                while (lItr.hasPrevious()) {
                    System.out.println(lItr.previous());
                }

        }
    }

    /**
     * print using Iterator
     *
     * @param arrayList - arraylist
     */
    private static void printArrayListUsingIterator(List<String> arrayList) {

        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    /**
     * print using for each
     *
     * @param arrayList - arraylist
     */
    private static void printArrayListUsingForEach(List<String> arrayList) {
        for (String str : arrayList) {
            System.out.println(str);
        }
    }

}
