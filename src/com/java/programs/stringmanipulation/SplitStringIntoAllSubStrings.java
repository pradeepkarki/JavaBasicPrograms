package com.java.programs.stringmanipulation;

import java.util.ArrayList;

public class SplitStringIntoAllSubStrings {
    public static void main(String[] args) {

        String s="abc";
        // variables to traverse through the
        // string
        int i, j;

        // to store the length of the
        // string
        int stringLength = s.length();

        // List object to store the list of
        // all substrings of the string s
        ArrayList<String> subStringList
                = new ArrayList<String>();

        // first for loop
        for (i = 0; i < stringLength; i++) {

            for (j = i + 1; j <= stringLength; j++) {

                subStringList.add(s.substring(i, j));
            }

        } // end of first for loop

        // returning the list (object
        // of ArrayList) of substrings
        // of string s
        System.out.println(subStringList);
    }
}
