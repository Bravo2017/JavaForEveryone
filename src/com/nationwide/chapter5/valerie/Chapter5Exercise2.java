package com.nationwide.chapter5.valerie;

/**
 * @author DEFENBV Chapter 5 Assignment 2
 */

public class Chapter5Exercise2 {

	/**
	 * Create a class with two methods, one with no return value and the other
	 * with one. Add method comments to each and call them from main.
	 */
	public static void main(String[] args) {

		noReturnValue();

		int theNumber = oneReturnValue();

		System.out.println("Method oneReturnValue returned the number "
				+ theNumber);

	}

	public static void noReturnValue() {
		/**
		 * This method doesn't return anything
		 */

		System.out.println("This method has no return value");
	}

	public static int oneReturnValue() {
		/**
		 * This method returns an integer
		 */
		int test = 1;
		return test;

	}

}