package com.java.concepts.collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
        Reverse the linked list using the descending iterator
         */
        System.out.println("-----------------Print reverse using descending iterator---------------");
        reverseLinkedList(linkedList);

        /*
        Reverse the linked list using the list iterator
         */
        System.out.println("-----------------Print reverse using list iterator---------------");
        reverseLinkedListUsingListIterator(linkedList);


        /*
        Push and pop in linked list
        Push -add to the first index
        pop - pop from the first index
         */
        linkedList.pop();

        linkedList.push("NEW ELEMENT");

        System.out.println(linkedList);

        /*
         poll(): Retrieves and removes the head (first element
            of this list*/
        System.out.println("Removed element:" + linkedList.poll());

        /*
        pollFirst(): Retrieves and removes the first element
        of this list, or returns null if this list is empty.
      */

        System.out.println("Removed element:" + linkedList.pollFirst());

        /*
         Retrieves and removes the last element of this list, or returns null if this list is empty.*/
        System.out.println("Removed element:" + linkedList.pollLast());

        /*

        public E peek(): Retrieves, but does not remove, the head (first element) of this list.

        public E peekFirst(): Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.

        public E peekLast(): Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.

         */


    }

    private static void reverseLinkedListUsingListIterator(LinkedList<String> linkedList) {
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    private static void reverseLinkedList(LinkedList<String> linkedList) {
        Iterator<String> descItr = linkedList.descendingIterator();
        while (descItr.hasNext()) {
            System.out.println(descItr.next());
        }
    }
}
