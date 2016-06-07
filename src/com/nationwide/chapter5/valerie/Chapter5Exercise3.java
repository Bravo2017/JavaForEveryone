package com.nationwide.chapter5.valerie;

/**
 * @author DEFENBV Chapter 5 Assignment 3
 */

public class Chapter5Exercise3 {

	/**
	 * Create a class with one method that uses a variable name twice in
	 * different scopes.
	 */
	public static void main(String[] args) {

		double amount = 1;

		for (int i = 1; i <= 10; i++) {
			amount = amount * 1.5;
			System.out.println("amount in the first for loop is " + amount
					+ " when i = " + i);
		}

		for (int i = 1; i <= 10; i++) {
			amount = (amount + i) * i;
			System.out.println("amount in the second for loop is " + amount
					+ " when i = " + i);
		}

		System.out.println("The final amount is " + amount);

	}

}
