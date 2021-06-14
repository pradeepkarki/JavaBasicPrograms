package com.java.programs.stringmanipulation;

import java.util.Arrays;

class SortStringInAlphabeticalOrder {

    public static void main(String[] args) {
        String str ="Java sorting program";

        String[] strArray = str.split(" ");

        String temp = "";
        for (int i=0;i<strArray.length-1;i++)
        {
            for (int j=i+1;i< strArray.length;i++)
            {
                if (strArray[i].compareTo(strArray[j+1])>1)
                {
                    temp = strArray[i];
                    strArray[i] = strArray[j+1];
                    strArray[j+1] = temp;
                }
            }
        }
        Arrays.stream(strArray).forEach(System.out::println);

    }
    
}
