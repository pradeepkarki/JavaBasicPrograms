package com.java.programs.companies;

import java.util.HashMap;
import java.util.Map;

public class RingCentral {

    public static void main(String[] args) {

        /**
         *
         *        String s1="aaa";
         *        String s2="aaa";
         *
         *        System.out.println(s1==s2); //true
         *
         *        s1 = new String("aaa");
         *        s2 = new String("aaa");
         *
         *        System.out.println(s1==s2); //false
         *
         *
         */
        String str = "()()()()()";
        char[] chArray = str.toCharArray();

        if(str.length()<0)
        {
            System.out.println("empty string");
        }

        Map<Character,Integer> hmap= new HashMap<>();

        for(Character c: chArray)
        {
            if(hmap.containsKey(c))
            {
                hmap.put(c,hmap.get(c)+1);
            }
            else {
                hmap.put(c,1);
            }
        }
        System.out.println(hmap);


        if(hmap.get('(')==hmap.get(')'))
        {
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }


    }
}
