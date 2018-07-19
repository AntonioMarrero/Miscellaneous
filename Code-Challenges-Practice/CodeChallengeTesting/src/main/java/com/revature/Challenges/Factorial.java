package com.revature.Challenges;

public class Factorial {

	public static void main(String[] args) {
		
		int i;
		int fac = 1;
		int number = 4; // number to be calculated.
		
		for(i = 1; i <= number; i++) {
			fac = fac * i;
		}
		
		System.out.println("Factorial of " +number+ " is: " +fac);
	}
}
