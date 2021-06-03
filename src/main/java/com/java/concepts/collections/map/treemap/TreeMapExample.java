package com.java.concepts.collections.map.treemap;

import javax.sound.midi.Soundbank;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();

        /*Adding elements to TreeMap*/
        tmap.put(1, "Data1");
        tmap.put(23, "Data2");
        tmap.put(70, "Data3");
        tmap.put(4, "Data4");
        tmap.put(2, "Data5");

        //Display using iterator
        System.out.println("________________________Display using Iterator________________________________________");
        Iterator<Map.Entry<Integer,String>> itr=tmap.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<Integer,String> en=itr.next();
            System.out.println(en.getKey());
            System.out.println(en.getValue());
        }

        //Using for each
        System.out.println("_____________________Display using for each________________________________________");
        for (Map.Entry en: tmap.entrySet())
        {
            System.out.println(en.getValue());
            System.out.println(en.getKey());
        }

        System.out.println("___________________Print in reverse order________________________________");
        TreeMap<Integer, String> tmap2 = new TreeMap<>(Collections.reverseOrder());

        /*Adding elements to TreeMap*/
        tmap2.put(1, "Data1");
        tmap2.put(23, "Data2");
        tmap2.put(70, "Data3");
        tmap2.put(4, "Data4");
        tmap2.put(2, "Data5");

//Using for each
        System.out.println("_____________________Display reversed using for each________________________________________");
        for (Map.Entry en: tmap2.entrySet())
        {
            System.out.println(en.getValue());
            System.out.println(en.getKey());
        }


    }
}
