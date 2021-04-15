package com.java.programs.stringmanipulation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Java Program to Count Number of Vowels in a String using Collection
 */
public class NumberOfVowelsInStringV3 {


    public static void main(String[] args) {
        //Number of vowels

        String words = "helloooooooaei oo world";

        char[] charArray = words.toLowerCase().toCharArray();

        int count = 0;
        List<Character> array = new ArrayList<>();
        for (char ch : charArray) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                array.add(ch);
            }
        }
        Set<Character> set = new HashSet<>(array);

        System.out.println("vowels----" + set + "\ncount" + count);


    }

}
