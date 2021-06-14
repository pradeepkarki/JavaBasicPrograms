package com.java.programs.faq;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String input="pradeep";
        HashMap<Character,Integer> hmap= new HashMap<>();

        char[] chArray = input.toCharArray();

        for (Character ch:chArray)
        {
                if(hmap.containsKey(ch))
                {
                    hmap.put(ch,hmap.get(ch)+1);
                }
                else
                {
                    hmap.put(ch,1);
                }
        }
        System.out.println(hmap);

        System.out.println("Result - "+ getFirstNonRepeatingChar(hmap, chArray));

    }

    private static Character getFirstNonRepeatingChar(HashMap<Character, Integer> hmap, char[] chArray) {
        char result = 0;
        for (Character ch: chArray)
        {
            if(hmap.get(ch)==1)
            {
             result=ch;
             break;
            }
        }
        return result;
    }
}
