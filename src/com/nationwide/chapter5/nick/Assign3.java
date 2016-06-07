package com.nationwide.chapter5.nick;

public class Assign3 {
	/**
	 * Create a class with one method that uses a variable name twice in
	 * different scopes.
	 */
	public static void main(String[] args) {

		double amount = 1;

		for (int i = 1; i <= 5; i++) {
			amount = amount * 2;
			System.out
					.println("First for loop is " + amount + " when i = " + i);
		}

		for (int i = 1; i <= 5; i++) {
			amount = (amount + i) * i;
			System.out.println("Second for loop is " + amount + " when i = "
					+ i);
		}

		System.out.println("Val owes Me: " + amount);

	}

}
