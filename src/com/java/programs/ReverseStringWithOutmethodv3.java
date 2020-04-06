package com.java.programs;

/**
 * Using split("") and add to array and iterate from last character
 * 
 * 
 */
public class ReverseStringWithOutmethodv3
{

	public static void main(String[] args)
	{
		String str = "abcde";
		String[] split = str.split("");

		int length = split.length;

		for (int i = length - 1; i >= 0; i--)
		{
			System.out.print(split[i]);
		}

	}
}
