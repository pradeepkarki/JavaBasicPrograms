package com.java.programs;

/**
 * 
 * Class is used for the Bubble Sort program
 * 
 * @author pradeep
 *
 */
public class BubbleSort {
	/**
	 * Bubble sort program :----
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 2, 9, 13, 10, 15, 34, 5, 7 };

		bubbleSort(arr);
	}

	private static void bubbleSort(int[] arr) {
		int size = arr.length;
		int temp;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.print("Array elements -> ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}
}
