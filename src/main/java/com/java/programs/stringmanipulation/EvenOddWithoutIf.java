package com.java.programs.stringmanipulation;

/**
 * Check number is even or odd without using if
 *
 */
public class EvenOddWithoutIf {

    public static void main(String[] args) {
        int num=121;
        int rem = num%2;
        System.out.println("reminder"+rem);
        switch (rem)
        {
            case 0:
            System.out.println("Number is even - "+num);
            break;

            default:
                System.out.println("number is odd - "+num);
        }
    }
}
