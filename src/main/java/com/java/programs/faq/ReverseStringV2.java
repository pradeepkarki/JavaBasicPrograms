package com.java.programs.faq;

public class ReverseStringV2 {
    public static void main(String[] args) {
        String str="String";
        String[] chArr= str.split("");

        for(int i=chArr.length-1;i>=0;i--)
        {
            System.out.print(chArr[i]);
        }
    }
}
