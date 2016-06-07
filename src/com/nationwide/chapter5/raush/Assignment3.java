package com.nationwide.chapter5.raush;

public class Assignment3 {

	/**
	 * Create a class with one method that uses a variable name twice in
	 * different scopes
	 */
	int x = 10;

	public static void main(String[] args) {
		int x = 10;
		if (x == 10) {
			System.out.println(" x not equal 10");
		}
	}
}