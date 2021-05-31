package com.java.programs.faq;

/**
 *
 * Fibonacci series
 * 0 1 1 2 3 5 8 13
 *
 * solution 1:
 * n1 | n2 | n3
 * 0  | 1  | 0+1
 *
 * n3=n1+n2
 * n1=n2
 * n2=n3
 *
 *
 * Solution 2:
 *
 *  n1      | n2
 *  0       | 1
 *  n2-n1   | n1+n2
 *
 *
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        int number = 10;
        //withThirdVariable(number);
        withOutThirdVariable(number);
    }

    /**
     *
     * fibonacci series without third varaible
     *
     * @param number - input number
     */
    private static void withOutThirdVariable(int number) {
        int n1=0,n2=1;

        for (int i=0;i<=number;i++)
        {
            n2=n1+n2;
            System.out.println(n2);
            n1=n2-n1;

        }
    }

    /**
     * Fibonacii series with third variable
     *
     * @param number - input number
     */
    private static void withThirdVariable(int number) {
        int n1=0,n2=1,n3=0;
        System.out.println(n1+"\n"+n2);
        for (int i = 2; i<= number; i++)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }
}
