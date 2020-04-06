package com.java.programs;

/*
 * The main method contains a loop to check prime numbers one by one.
The main method calls the method CheckPrime to determine whether a number is prime
We need to divide an input number, say 17 from values 2 to 17 and check the remainder. If the remainder is 0 number is not prime.
No number is divisible by more than half of itself. So, we need to loop through just numberToCheck/2. If the input is 17, half is 8.5, and the loop will iterate through values 2 to 8
If numberToCheck is entirely divisible by another number, we return false, and loop is broken.
If numberToCheckis prime, we return true.
In the main method, check isPrime is TRUE and add to primeNumbersFound String
Lastly, print the results
 */
public class PrimeNumber
{
	public static void main(String[] args)
	{
		int num = 7;
		boolean isPrime = true;

		for (int i = 2; i < num / 2; i++)
		{
			int rem = num % i;

			if (rem == 0)
			{
				isPrime = false;
			}
		}

		if (isPrime)
		{
			System.out.println("prime number");
		} else
		{
			System.out.println("Not a prime number");
		}

	}
}
