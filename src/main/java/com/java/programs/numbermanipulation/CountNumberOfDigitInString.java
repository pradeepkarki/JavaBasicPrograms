package com.java.programs.numbermanipulation;

/**
 *
 * Java Program to Count Number of Digits in a String
 *
 * Assci from 48 to 57
 *
 */
public class CountNumberOfDigitInString {

    public static void main(String[] args) {
        String str = "GeeksforGeeks password is : 1230";
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                count++;
            }
        }
        System.out.println("Number of digits - " + count);

    }
}
