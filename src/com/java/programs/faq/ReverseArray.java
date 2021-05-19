package com.java.programs.faq;

public class ReverseArray {
    public static void main(String[] args) {
        int[] intArr={1,2,3,4};

        for(int i=intArr.length-1;i>=0;i--)
        {
            System.out.println(intArr[i]);
        }
    }
}
