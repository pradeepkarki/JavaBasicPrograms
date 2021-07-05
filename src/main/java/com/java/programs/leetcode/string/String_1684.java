package com.java.programs.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
 * <p>
 * Return the number of consistent strings in the array words.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Output: 2
 * Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 * Example 2:
 * <p>
 * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * Output: 7
 * Explanation: All strings are consistent.
 * Example 3:
 * <p>
 * Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
 * Output: 4
 * Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
 */
public class String_1684 {
    public static void main(String[] args) {

        int ans = 0;
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};

        Set<Character> hashset = new HashSet<>();

        for (char c : allowed.toCharArray()) {
            hashset.add(c);
        }
        ans = words.length;

        for (String str : words) {
            for (int i = 0; i < str.length(); i++) {
                if (!hashset.contains(str.charAt(i))) {
                    ans--;
                    break;
                }
            }
        }
        System.out.println(ans);


    }
}
