package com.java.programs.faq;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }

    public static boolean isPalindrome(int number)
    {
        int reversedNumber=0;
        int temp=number;
        int rem =0;

        while(number>0)
        {
            rem= number%10;
            reversedNumber =reversedNumber*10+rem;
            number = number/10;
        }

        return reversedNumber==temp;

    }


}
