package com.nationwide.chapter5;

public class ScopeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Example 1
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int square = i * i;
			sum = sum + square;
		}
		// Can't access i here
		System.out.println(sum);

		// Example 2
		// Multiple i variables
		// don't overlap
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		for (int i = 1; i <= 10; i++) {
			sum = sum + i * i;
		}
		System.out.println(sum);

	}

}