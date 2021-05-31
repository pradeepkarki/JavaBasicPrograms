package com.java.programs.numbermanipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumberFromString {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("string1 more5string2");
        int sum=0;
        while(m.find()) {
            sum=  sum + Integer.parseInt(m.group());
            System.out.println(m.group());
        }
        System.out.println(sum);
    }
}
