package com.java.concepts.collections.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Commonly used methods of Vector Class:
 * void addElement(Object element): It inserts the element at the end of the Vector.
 * int capacity(): This method returns the current capacity of the vector.
 * int size(): It returns the current size of the vector.
 * void setSize(int size): It changes the existing size with the specified size.
 * boolean contains(Object element): This method checks whether the specified element is present in the Vector. If the element is been found it returns true else false.
 * boolean containsAll(Collection c): It returns true if all the elements of collection c are present in the Vector.
 * Object elementAt(int index): It returns the element present at the specified location in Vector.
 * Object firstElement(): It is used for getting the first element of the vector.
 * Object lastElement(): Returns the last element of the array.
 * Object get(int index): Returns the element at the specified index.
 * boolean isEmpty(): This method returns true if Vector doesn’t have any element.
 * boolean removeElement(Object element): Removes the specifed element from vector.
 * boolean removeAll(Collection c): It Removes all those elements from vector which are present in the Collection c.
 * void setElementAt(Object element, int index): It updates the element of specifed index with the given element.
 */
public class VectorExample {

    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        /* Adding elements to a vector*/
        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        System.out.println("_________________________________Using Enumeration________________________________________");
        Enumeration<String> en = vec.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

        System.out.println("_________________________________Using Iterator________________________________________");
        //Obtaining an iterator
        Iterator<String> it = vec.iterator();

        System.out.println("Vector elements are:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("_________________________________Using List Iterator________________________________________");
        ListIterator<String> listIterator = vec.listIterator();

        //Forward direction
        System.out.println("Forward direction");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        //Backward direction
        System.out.println("Backward direction");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
