package com.revature.Challenges;

import java.util.Stack;

public class BalancedParenthesesImproved {
	
	public static boolean isBalanced(String expression) {
		//Must be even otherwise is false
		if(expression.length()%2 == 1) return false; 
		
		else {
			char[] brackets = expression.toCharArray();
			Stack<Character> s =  new Stack<Character>();
			
			for(char bracket : brackets) 
				switch(bracket) {
					case '{': s.push('}');
					break;
					case '(': s.push(')');
					break;
					case '[': s.push(']');
					break;
					default :
						if(s.empty() || bracket != s.peek())
							return false;
						s.pop();
				}
			return s.empty();
		}
	}

	public static void main(String[] args) {
		
		String expression = "{([])}";
		
		System.out.println(isBalanced(expression));

	}

}
