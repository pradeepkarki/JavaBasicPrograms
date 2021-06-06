package com.java.programs.faq.primenumber;

/**
 * Java Program to check if a number is Prime or Not.
 */
public class PrimeNumbers {

    public static void main(String[] args) {

        int number = 4;
        System.out.println("Is prime method 1 - "+isPrime1(number));;

    }

    private static boolean isPrime1(int number) {
        for (int i = 2; i <=(int) Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
