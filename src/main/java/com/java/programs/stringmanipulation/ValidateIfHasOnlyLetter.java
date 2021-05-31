package com.java.programs.stringmanipulation;

/**
 * find If a given String contains only letters in Java
 *
 */
public class ValidateIfHasOnlyLetter {

    public static void main(String[] args) {
        String words="asdfasdfsadfZ";
        System.out.println(containsOnlyLetter(words));

    }
    public static boolean containsOnlyLetter(String word)
    {
        char[] charArray=word.toCharArray();
        for (char ch:charArray) {
            if (!(ch>='a' && ch <='z')) {
               return false;
            }
        }
        return true;
    }
}
