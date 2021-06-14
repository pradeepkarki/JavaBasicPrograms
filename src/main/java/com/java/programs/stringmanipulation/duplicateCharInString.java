package com.java.programs.stringmanipulation;

import java.util.HashMap;
import java.util.Map;

/**
 * This program would find out the duplicate characters in a String and would display the count of them.
 *
 * 1.Store the char and the count using hasmap
 * 2.check if any char count > 1
 *
 */

public class duplicateCharInString {

    public static void main(String[] args) {
        String input ="ball";
        HashMap<Character,Integer> hMap= new HashMap<>();

        char[] chArray = input.toCharArray();

        for (Character ch:chArray)
        {
            if(hMap.containsKey(ch))
            {
                hMap.put(ch,hMap.get(ch)+1);
            }
            else
            {
                hMap.put(ch,1);
            }
        }

        System.out.println("Hashmap - "+hMap);

        for (Map.Entry<Character,Integer> en: hMap.entrySet())
        {
            if(en.getValue()>1)
            {
                System.out.println("Duplicate char in String : "+en.getKey());
            }
        }

    }

}
