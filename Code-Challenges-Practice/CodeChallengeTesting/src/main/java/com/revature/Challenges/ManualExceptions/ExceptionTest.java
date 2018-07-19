package com.revature.Challenges.ManualExceptions;

public class ExceptionTest {

	public static void main(String[] args) {
		printStack();
	}
	
	public static void printStack() {
		throw new NullPointerException("NullPointerException Test");
	}

}
