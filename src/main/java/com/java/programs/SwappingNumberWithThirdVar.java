package com.java.programs;

public class SwappingNumberWithThirdVar
{
	public static void main(String[] args)
	{
		int a = 10, b = 11, temp;

		temp = a;
		a = b;
		b = temp;

		System.out.println("After swapping - " + a + " " + b);

	}
}
