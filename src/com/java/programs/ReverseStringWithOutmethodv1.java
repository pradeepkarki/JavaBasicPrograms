package com.java.programs;

/**
 * 
 * Using toCharArray() to split the character and print from end
 * 
 * @author TP00027565
 *
 */
public class ReverseStringWithOutmethodv1
{

	public static void main(String[] args)
	{
		String str = "abcde";
		char[] charArray = str.toCharArray();

		int numberOfChar = charArray.length;
		for (int i = numberOfChar - 1; i >= 0; i--)
		{
			System.out.print(charArray[i]);
		}

	}
}
