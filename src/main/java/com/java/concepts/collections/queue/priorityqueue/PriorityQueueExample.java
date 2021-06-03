package com.java.concepts.collections.queue.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<String> queue = new PriorityQueue<String>(15, new MyComparator());
        queue.add("Tyrion Lannister");
        queue.add("Daenerys Targaryen");
        queue.add("Arya Stark");
        queue.add("Petyr 'Littlefinger' Baelish");

        System.out.println("-------------------Iterator-------------------------");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------------Poll------------------------------");
        /*
         * What I am doing here is removing the highest
         * priority element from Queue and displaying it.
         * The priority I have set is based on the string
         * length. The logic for it is written in Comparator
         */
        while (queue.size() != 0) {
            System.out.println(queue.poll());

        }
    }
}
