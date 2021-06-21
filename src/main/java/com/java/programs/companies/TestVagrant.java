package com.java.programs.companies;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Round 1,2 - Technical
 * <p>
 * Found 1:
 * <p>
 * Find the 1st non repeating char from the string
 * <p>
 * Round 2:
 * <p>
 * Extract number from String and add
 */
public class TestVagrant {
    public static void main(String[] args) {
        String s = round1();
        System.out.println("Output - " + s);
        round2();
    }

    private static String round1() {
        String str = "asdfasdfasdf";
        String result = "";
        char[] chArr = str.toCharArray();
        Map<Character, Integer> hMap = new HashMap<>();

        for (Character ch1 : chArr) {
            if (hMap.containsKey(ch1)) {
                hMap.put(ch1, hMap.get(ch1) + 1);
            } else {
                hMap.put(ch1, 1);
            }
        }

        for (Character ch : chArr) {
            if (hMap.get(ch) == 1) {
                result = result + ch;
                break;
            }

        }
        return result;
    }


    private static void round2() {
        int result = 0;
        Pattern p = Pattern.compile("\\d+");
        Matcher matcher = p.matcher("asdfasdf123dsfgsdfg1");
        while (matcher.find()) {
            result = result + Integer.parseInt(matcher.group());
        }
        System.out.println("Sum from String - " + result);
    }
}
