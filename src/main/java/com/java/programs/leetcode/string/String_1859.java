package com.java.programs.leetcode.string;

import java.util.Arrays;

public class String_1859 {

    public static void main(String[] args) {
        String s= "is2 sentence4 This1 a3";
        String[] strArray = s.split(" ");
        String[] res = new String[strArray.length];

        for(String str: strArray)
        {
            int index = Integer.parseInt(String.valueOf(str.charAt(str.length()-1))) -1;
            System.out.println(str.substring(0,str.length()-1));
            res[index] = str.substring(0,str.length()-1);
        }

        String temp ="";
        for(int i=0;i<res.length;i++)
        {
            temp =temp+res[i];
            if(i!=res.length) {
                temp = temp + " ";
            }
        }
        System.out.println(temp);
    }
}
