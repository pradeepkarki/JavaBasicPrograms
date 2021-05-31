package com.java.programs.faq;

/**
 * Write a method that will accept an array of int as an argument and it will return the max/min number from a given array.
 * <p>
 * // max({4, 781, 8, 99, 103})   -> 781
 * // max({1, 2, 3, 4, 5})        -> 5
 * // max({3, 4})                 -> 4
 * // max({100})                  -> 100
 *
 *Logic:
 *  Store first element in an varaibale and check with other elements in array
 *
 *  to get max :
 *  if(max<array[i])
 *  max=array[i]
 *
 *  to get min :
 *  if(min>array[i])
 *   min=array[i]
 *
 *
 */
public class MaxMinFromArray {
    public static void main(String[] args) {
        int[] array = {4, 781, 8, 99, 103};
        System.out.println(maxFromArray(array));
    }

    public static int maxFromArray(int[] array) {
        int max=array[0];

        for (int i=0;i<array.length ;i++)
        {
            if (max<array[i])
            max=array[i];
        }

        return max;
    }

}
