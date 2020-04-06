package com.java.programs;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Count the number of words in a string
 * 
 * 
 * @author TP00027565
 *
 */
public class CountNumberOfWordsInString
{

	public static void main(String[] args)
	{

		String str = "This is a sample example";

		String[] split = str.split(" ");

		Map<String, Integer> wordMap = new HashMap<>();

		for (String string : split)
		{

			wordMap.put(string, string.length());
		}
		System.out.println(wordMap);
	}

}
