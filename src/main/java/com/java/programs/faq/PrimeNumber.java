package com.java.programs.faq;

/**
 * prime number are those number which are divisible by 1 or itself
 *
 * logic check the number is divisible or not from 2 to number - 1
 *
 *
 */
public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(9));

        System.out.println(isPrime(12));
        System.out.println(isPrime(5));

        System.out.println(isPrime(11));
        System.out.println(isPrime(13));
        System.out.println(isPrime(17));
        System.out.println(isPrime(19));
        System.out.println(isPrime(23));

    }
    public static boolean isPrime(int number)
    {
        if (number==0|number==1)
        {
            System.out.println("number is not prime");
        }
        for (int i=2;i<number/2;i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
        
    }
}
