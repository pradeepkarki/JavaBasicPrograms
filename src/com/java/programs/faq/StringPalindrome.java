package com.java.programs.faq;

public class StringPalindrome {
    public static void main(String[] args) {
        String palin="madam";

        String temp = palin;
        String rev="";
        String[] strArr = palin.split("");
        System.out.println(strArr.length);
        for (int i=strArr.length-1;i>=0;i--)
        {
            rev+=strArr[i];
        }
        System.out.println(rev);
        if(rev.equals(temp))
        {
            System.out.println("String is palindrome");
        }

    }
}
