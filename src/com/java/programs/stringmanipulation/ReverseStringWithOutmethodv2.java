package com.java.programs.stringmanipulation;

/**
 * Using charAt(i) to get the character iterate from end to start
 * 
 * 
 */
public class ReverseStringWithOutmethodv2
{

	public static void main(String[] args)
	{
		String str = "abcde";
		int length = str.length();

		for (int i = length - 1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}
