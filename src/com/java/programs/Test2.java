package com.java.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Test 2
 */

public class Test2 {

    public static void main(String[] args) {
        //Numbeer of vowels

        String words = "hello world";

        char[] charArray = words.toCharArray();

        int count = 0;
        List<Character> array= new ArrayList<>();
        for (char ch : charArray) {

        	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				array.add(ch);
			}
        }
        Set<Character> set=new HashSet<>(array);

		System.out.println("vowels----"+set+"\ncount"+count);


    }
}
