package com.java.programs.stringmanipulation;

/**
 *
 * Program to calculate number of upper case letters
 *
 * Assi from 65 to90
 *
 */
public class CountNumberOfCapitalLetters {

    public static void main(String[] args) {

        String str = "GeeksforGeeks password is : 1234";
        int count = 0;
        String temp = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                count++;
                temp = temp + str.charAt(i);
            }
        }
        System.out.println("Albhabets - " + temp);
        System.out.println("Number of digits - " + count);
    }
}
