package com.java.programs.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWordsInStringv1 {

    public static void main(String[] args) {

        String words = "He is married and she is not";

        Map<String, Integer> hashMap = new HashMap<>();

        String[] splitWords = words.split(" ");

        for (String str : splitWords) {
            if(hashMap.containsKey(str))
            {
                hashMap.put(str,hashMap.get(str)+1);
            }else {
                hashMap.put(str,1);
            }
        }
        System.out.println(hashMap);
    }
}
