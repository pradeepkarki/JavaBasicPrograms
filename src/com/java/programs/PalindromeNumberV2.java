package com.java.programs;

/**
 * Program to find if the number is Palindrome or not.
 *
 * @author TP00027565
 *
 */
public class PalindromeNumberV2
{
	public static void main(String[] args)
	{
		int num = 121, result = 0, rem = 0, temp;

		temp = num;

		while (num > 0)
		{
			rem = num % 10;

			result = result * 10 + rem;

			num = num / 10;
		}

		if (result == temp)
		{
			System.out.println("Palindrome");
		} else
		{
			System.out.println("Number is not palindrome");
		}
	}
}
