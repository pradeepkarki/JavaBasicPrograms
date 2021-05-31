package com.java.concepts.collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        //Insert the value
        linkedList.add("learn");
        linkedList.add("java");
        linkedList.add("collection");
        linkedList.add("with example");

        System.out.println("____________________Before any operation____________________");
        System.out.println(linkedList);

        linkedList.addFirst("start");
        linkedList.addLast(" below");

        System.out.println("____________________After adding first last____________________");
        System.out.println(linkedList);
        linkedList.removeLast();

        System.out.println("After removing last");
        System.out.println(linkedList);

        System.out.println("____________________Print using iterator____________________");
        //Print all elements from linkedList
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
