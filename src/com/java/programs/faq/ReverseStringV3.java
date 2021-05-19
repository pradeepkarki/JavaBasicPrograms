package com.java.programs.faq;

public class ReverseStringV3 {
    public static void main(String[] args) {
        String str="String";
        char[] chArr= str.toCharArray();

        for(int i=chArr.length-1;i>=0;i--)
        {
            System.out.print(chArr[i]);
        }
    }
}
