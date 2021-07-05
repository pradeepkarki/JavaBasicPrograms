package com.java.programs.leetcode.string;

public class String_1832_anagram_v2 {
    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(extracted(sentence));
    }

     static boolean extracted(String sentence) {
         if (sentence.length() < 26)
             return false;
         for(int i=97;i<=122;i++)
         {
             if(sentence.indexOf((char)i)<0)
                 return false;
         }
         return true;
    }
}
