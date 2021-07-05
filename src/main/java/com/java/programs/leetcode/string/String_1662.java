package com.java.programs.leetcode.string;

import java.util.Arrays;

public class String_1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(String.join("",word1).equals(String.join("",word2)));
    }
}
