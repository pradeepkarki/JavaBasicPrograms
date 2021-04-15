package com.java.programs.stringmanipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveUpperCaseNumberSpecChar {


    // Function to remove uppercase characters
    public static String
    removingUpperCaseCharacters(String str) {

        // Create a regular expression
        String regex = "[A-Z]";

        // Compile the regex to create pattern
        // using compile() method
        Pattern pattern = Pattern.compile(regex);

        // Get a matcher object from pattern
        Matcher matcher = pattern.matcher(str);

        // Replace every matched pattern with the
        // target string using replaceAll() method
        return matcher.replaceAll("");
    }

    // Function to remove lowercase characters
    public static String
    removingLowerCaseCharacters(String str) {

        // Create a regular expression
        String regex = "[a-z]";

        // Compile the regex to create pattern
        // using compile() method
        Pattern pattern = Pattern.compile(regex);

        // Get a matcher object from pattern
        Matcher matcher = pattern.matcher(str);

        // Replace every matched pattern with the
        // target string using replaceAll() method
        return matcher.replaceAll("");
    }

    // Function to remove special characters
    public static String
    removingSpecialCharacters(String str) {

        // Create a regular expression
        String regex = "[^A-Za-z0-9]";

        // Compile the regex to create pattern
        // using compile() method
        Pattern pattern = Pattern.compile(regex);

        // Get a matcher object from pattern
        Matcher matcher = pattern.matcher(str);

        // Replace every matched pattern with the
        // target string using replaceAll() method
        return matcher.replaceAll("");
    }

    // Function to remove numeric characters
    public static String
    removingNumericCharacters(String str) {

        // Create a regular expression
        String regex = "[0-9]";

        // Compile the regex to create pattern
        // using compile() method
        Pattern pattern = Pattern.compile(regex);

        // Get a matcher object from pattern
        Matcher matcher = pattern.matcher(str);

        // Replace every matched pattern with the
        // target string using replaceAll() method
        return matcher.replaceAll("");
    }

    // Function to remove non-numeric characters
    public static String
    removingNonNumericCharacters(String str) {

        // Create a regular expression
        String regex = "[^0-9]";

        // Compile the regex to create pattern
        // using compile() method
        Pattern pattern = Pattern.compile(regex);

        // Get a matcher object from pattern
        Matcher matcher = pattern.matcher(str);

        // Replace every matched pattern with the
        // target string using replaceAll() method
        return matcher.replaceAll("");
    }

    // Driver Code
    public static void main(String[] args) {
        // Given String str
        String str = "GFGgfg123$%";

        // Print the strings after the simultaneous
        // modifications
        System.out.println(
                "After removing uppercase characters: "
                        + removingUpperCaseCharacters(str));
        System.out.println(
                "After removing lowercase characters: "
                        + removingLowerCaseCharacters(str));
        System.out.println(
                "After removing special characters: "
                        + removingSpecialCharacters(str));
        System.out.println(
                "After removing numeric characters: "
                        + removingNumericCharacters(str));
        System.out.println(
                "After removing non-numeric characters: "
                        + removingNonNumericCharacters(str));
    }
}
