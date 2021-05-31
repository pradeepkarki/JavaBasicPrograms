package com.java.programs.stringmanipulation;

/**
 * Java Program to Count Number of Vowels in a String using recursion
 */
public class NumberOfVowelsInStringV2 {


    public static void main(String[] args) {
        String sample = "This is a java progrAm";
        char[] charArray = sample.toLowerCase().toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == 'a' ||
                    charArray[i] == 'e' ||
                    charArray[i] == 'i' ||
                    charArray[i] == 'o' ||
                    charArray[i] == 'u')
            {
                count++;
            }
        }
        System.out.println("Number of vowels-"+count);
    }

}
