package com.java.concepts.collections.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<String>();

        // Add elements into Vector
        vector.add("Chaitanya");
        vector.add("Shubham");
        vector.add("Apoorv");
        vector.add("Jin");
        vector.add("Jacob");

        // Get Enumeration of Vector elements
        Enumeration<String> en = vector.elements();

        /* Display Vector elements using hashMoreElements()
         * and nextElement() methods.
         */
        System.out.println("Vector elements are: ");
        while (en.hasMoreElements())
            System.out.println(en.nextElement());


        //Obtaining an iterator
        Iterator<String> it = vector.iterator();

        System.out.println("Vector elements are:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //List iterator
        ListIterator<String> litr = vector.listIterator();
        System.out.println("Traversing in Forward Direction:");
        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }

        System.out.println("\nTraversing in Backward Direction:");
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }
    }


}
