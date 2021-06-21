package com.java.programs.companies;

/**
 *
 *
 */
public class Fynd {
    public static void main(String[] args) {
        String input = "string java prog ";
        String[]  strArr = input.split(" ");
        String result = "";
        for (String str: strArr)
        {
            char[] chArray = str.toCharArray();
            for (int i=chArray.length-1;i>=0;i--)
            {
                System.out.print(chArray[i]);
            }
            System.out.print(" ");
        }
    }
}
