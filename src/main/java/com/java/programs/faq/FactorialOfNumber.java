package com.java.programs.faq;

/**
 *
 * write a program to find the factorial of a number
 *
 */
public class FactorialOfNumber {

    public static void main(String[] args) {
        int number =6;
        int fact=1;

        for(int i=1;i<=number;i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of a number - "+fact);
    }
}
