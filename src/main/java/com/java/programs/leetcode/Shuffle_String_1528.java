package com.java.programs.leetcode;

/**
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 */
public class Shuffle_String_1528 {

    public static void main(String[] args) {
        String s = "aiohn";
        int[] indices = {3, 1, 4, 2, 0};

        char[] ch = new char[indices.length];
        for (int i = 0; i <= indices.length - 1; i++) {

            ch[indices[i]] = s.charAt(i);

        }
        System.out.println(ch);


    }
}
