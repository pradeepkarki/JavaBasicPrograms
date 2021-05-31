package com.java.concepts.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        //Insert the value
        arrayList.add("learn");
        arrayList.add("java");
        arrayList.add("collection");

        System.out.println("Before sorting");

        System.out.println(arrayList);

        System.out.println("After Sorting ASC");
        //sort ascending order
        Collections.sort(arrayList);

        System.out.println(arrayList);

        System.out.println("Sorting reverse");

        //Sort reverse
        Collections.sort(arrayList,Collections.reverseOrder());

        System.out.println(arrayList);


    }
}
