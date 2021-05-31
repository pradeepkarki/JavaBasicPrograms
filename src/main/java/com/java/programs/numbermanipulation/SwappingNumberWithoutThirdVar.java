package com.java.programs.numbermanipulation;

public class SwappingNumberWithoutThirdVar
{
	public static void main(String[] args)
	{

		int a = 10, b = 12;

		a = a + b;

		b = a - b;
		System.out.println("b - " + b);

		a = a - b;
		System.out.println("a - " + a);
	
	}
}
