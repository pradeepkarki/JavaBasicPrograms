package com.java.programs.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWordsInStringv2 {

    public static void main(String[] args) {

        String words = "He is married and she is not";

        Map<String, Integer> hashMap = new HashMap<>();

        String[] splitWords = words.split(" ");

       for (String str:splitWords)
       {
           Integer count = hashMap.get(str);
           if(count == null)
           {
               hashMap.put(str,1);
           }else
           {
               hashMap.put(str,count+1);
           }
       }
        System.out.println(hashMap);
    }
}
