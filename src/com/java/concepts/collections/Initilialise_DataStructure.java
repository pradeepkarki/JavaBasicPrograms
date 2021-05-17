package com.java.concepts.collections;


import java.util.*;

public class Initilialise_DataStructure {

    public static void main(String[] args) {


        //Array

        int[] a1 = new int[5];
        int[] a2 = new int[]{1, 2, 3, 4, 5};
        int a4[] = new int[]{2, 3};

        //sorting array
        Arrays.sort(a1);

        //list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        //sorting a list
        Collections.sort(list);

        //Set
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);

        //sorting a set
        /*
        directly u can not sort a set, first u have to convert it into a list, then sort it
         */

        List<Integer> sl = new ArrayList<>(set);
        Collections.sort(sl);
        set.size();



        //iterating through a set

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Stack(LIFO)
        Stack<Integer> stack = new Stack<>();
        /*
        adding elements
         */
        stack.push(1);
        stack.push(2);
        stack.push(3);

        /*
        removing elements -> it will remove the last element added
         */
        stack.pop();

        /*
        display the top of the elements in stack
         */
        stack.peek();

        /*
        iterating in stack
         */
        for (Integer k : stack) {
            System.out.println(k);
        }

        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }

        //Queue(FIFO)
        Queue<Integer> queue = new LinkedList<>();
        //OR
        Queue<Integer> queue1 = new ArrayDeque<>();

        /*
        adding element in queue
         */
        queue.add(1);
        queue.add(2);

        /*
        removing elements -> this will remove the first element added
         */
        queue.remove();

        /*
        display the head of the queue
         */
        queue.peek();

        //HashMap -> it allows one null key and multiple null values

        Map<Integer, String> map = new HashMap<>();

        /*
        adding key value pair in map
         */
        map.put(-1, "a");
        map.put(1, "h");
        map.put(-3, "g");
        map.put(-2, "b");

        printMap(map);

        /*
        for sorting by key of a mp, we need to use TreeMap
         */
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(map);
        map.size();
        printMap(treeMap);

        /*
        getting value of a key
         */
        map.get(1);
        for(int key : treeMap.keySet()){
            String j = treeMap.get(key);
        }

        /*
        iterating through a map
         */
        for (Map.Entry entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        for(Integer i : map.keySet()){
            System.out.println(map.get(i));
        }

        /*
        getting key set
         */
        Set<Integer> sKey = map.keySet();

        /*
        getting value set
         */
        Collection<String> sValue = map.values();



        //Hash Table -> it does not allow any null key or value
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, " a");
        ht.put(2, "b");
        ht.put(3, "c");
        ht.put(1,"4");

        /*
        iterating through a hash table
         */
        for (Map.Entry entry : ht.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        /*
        HashMap is generally preferred over HashTable if thread synchronization is not needed
         */


    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }



}
