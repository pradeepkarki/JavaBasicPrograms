package com.java.programs.stringmanipulation.reversestring;

/**
 * 
 * Using Stringbuilder to reverse the reverse()
 * 
 * @author TP00027565
 *
 */
public class ReverseStingWithmethod
{

	public static void main(String[] args)
	{
		String str = "abcde";
		StringBuilder builder = new StringBuilder();
		builder.append(str);

		StringBuilder reverse = builder.reverse();
		System.out.println("Reverse the string - " + reverse);

	}
}
