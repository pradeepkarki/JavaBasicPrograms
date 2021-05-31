package com.java.programs.numbermanipulation;

public class FindThirdLargestElement {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 5, 1, 7};

        // Initialize first, second and third Largest element
        int first = arr[0], second = Integer.MIN_VALUE,
                third = Integer.MIN_VALUE;

        // Traverse array elements to find the third Largest
        for (int i = 1; i < arr.length; i++) {
            /* If current element is greater than first,
        then update first, second and third */
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } /* If arr[i] is in between first and second */
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } /* If arr[i] is in between second and third */
            else if (arr[i] > third) {
                third = arr[i];
            }
        }

        System.out.printf("The third Largest element is %d\n", third);


    }
}
