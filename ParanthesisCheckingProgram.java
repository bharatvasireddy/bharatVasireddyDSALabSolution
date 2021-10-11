
package com.gl.stack;

import java.util.Stack;
import java.util.Scanner;

public class ParanthesisCheckingProgram {

	static void isParanthesisBalanced(String expr) {

		int x = expr.length();
		if (x % 2 != 0) {
			System.out.println("The Entered string donot contain Balanced Brackets");
		} else {
			// Declaring the stack
			Stack<Character> st = new Stack<>();

			// Traversing string
			for (int i = 0; i < x; i++) {

				// If opening brackets --> then pushing the character into stack
				if (expr.charAt(i) == '{' || expr.charAt(i) == '[' || expr.charAt(i) == '(') {

					st.push(expr.charAt(i));

				}
				/*
				 * If closing brackets --> Checking first stack is not empty and looking for
				 * whether last character in stack is matching opposite bracket and then popping
				 * the character from stack
				 */
				else if (!st.empty()
						&& ((expr.charAt(i) == ']' && st.peek() == '[') || (expr.charAt(i) == '}' && st.peek() == '{')
								|| (expr.charAt(i) == ')' && st.peek() == '('))) {

					st.pop();

				} else {
					st.push(expr.charAt(i));
				}
			}
			if (st.empty()) {
				System.out.println("The Entered string has Balanced Brackets ");
			} else {
				System.out.println("The Entered string donot contain Balanced Brackets");
			}
		}
	}

	public static void main(String[] args) {

		String s;
		System.out.println("Enter the paranthesis expression");
		Scanner obj = new Scanner(System.in);
		s = obj.next();
		isParanthesisBalanced(s);
		obj.close();

	}

}
