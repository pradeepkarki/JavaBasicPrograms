package com.java.programs.stringmanipulation.reversestring;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Reverse String using the Stack and Queue
 *
 *
 */
public class ReversStringUsingStackQueue {
    public static void main(String[] args) {

        System.out.print("Enter any string:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        System.out.println("Reversed using stack: " + reverseUsingStack(inputString));
        System.out.println("Reversed using Queue: " + reverseUsingQueue(inputString));

    }

    private static String reverseUsingQueue(String inputString) {
        Queue queue = new LinkedList();
        String reverse = "";
        char[] chArray = inputString.toCharArray();

        for (int i = chArray.length - 1; i >= 0; i--) {
            queue.add(chArray[i]);
        }
        while (!queue.isEmpty()) {
            reverse = reverse + queue.remove();
        }

        return reverse;
    }

    private static String reverseUsingStack(String inputString) {
        Stack stack = new Stack<>();
        String reverse = "";
        char[] chArray = inputString.toCharArray();

        for (Character ch : chArray) {
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            reverse = reverse + stack.pop();
        }

        return reverse;
    }
}
