package com.java.programs.leetcode.string;

public class String_709 {
    public static void main(String[] args) {

        toLowerCase("cbZ");
    }

    public static String toLowerCase(String s) {

        char[] charArray = s.toCharArray();

        String res="";
        for (char c : charArray) {
            if ((int) c >= 65 && (int) c <= 90) {
                res = res + (char)((int) c + 32);
            } else {
                res = res + c;
            }
        }
        return res;
    }
}
