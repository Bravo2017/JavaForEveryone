package com.nationwide.chapter5.vanwyk;

/**
 * Create a class with one method that uses a variable name twice in different
 * scopes.
 * 
 * @author VANWYKA1
 */

public class OneMethodVariableTwice {
	/**
	 * you can use the same variable multiple times in different ways of the
	 * same method as long as it is used in different scopes the example uses
	 * int (a) in two different while loops (scopes) to count up then back down
	 * again
	 */

	public static void main(String[] args) {

		duelScope(); // telling program to call duelScope Method

	}

	public static void duelScope() {
		int a = 0; // declaring int a as 0
		while (a < 5) { // while loop start a is less than 5
			System.out.println(a); // print out what (a) is
			a++; // increment a up by one each pass of loop
		}

		while (a >= -5) { // still using same variable in new scope (while loop)
			System.out.println(a); // prints what a is
			a--; // decrements value a on each loop
		}
	}
}
