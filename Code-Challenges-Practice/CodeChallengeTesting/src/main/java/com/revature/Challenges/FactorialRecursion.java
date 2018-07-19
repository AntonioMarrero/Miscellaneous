package com.revature.Challenges;

public class FactorialRecursion {

	public static void main(String[] args) {

		int i;
		int fac = 1;
		
		int number = 4; // number to be calculated.
		
		fac = factorial(number);
		
		System.out.println("Factorial of " +number+ " is: " +fac);

	}

	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		} else {
			return(n * factorial(n-1));
		}
	}
}
