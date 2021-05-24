package com.java.programs.faq;

/**
 * Write a method that will accept an array of int as an argument and it will return the max/min number from a given array.
 * <p>
 * // max({4, 781, 8, 99, 103})   -> 781
 * // max({1, 2, 3, 4, 5})        -> 5
 * // max({3, 4})                 -> 4
 * // max({100})                  -> 100
 * <p>
 * Logic:
 * Store first element in an varaibale and check with other elements in array
 * <p>
 * to get max :
 * if(max<array[i])
 * max=array[i]
 * <p>
 * to get min :
 * if(min>array[i])
 * min=array[i]
 */
public class MaxMinFromArrayV2 {
    public static void main(String[] args) {
        int[] array = {4, 781, 8, 99, 103};
        System.out.println("Minimum from Array - "+maxFromArray(array,"MIN"));
        System.out.println("Maximum from Array - "+maxFromArray(array,"MAX"));
    }

    public static int maxFromArray(int[] array,String minMax) {
        int maxMin = array[0];

        switch (minMax) {
            case "MAX":
                for (int k : array) {
                    if (maxMin < k)
                        maxMin = k;
                }
                break;
            case "MIN":
                for (int j : array) {
                    if (maxMin > j)
                        maxMin = j;
                }
                break;

        }
        return maxMin;
    }

}
