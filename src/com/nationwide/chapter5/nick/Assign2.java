package com.nationwide.chapter5.nick;

public class Assign2 {

	/**
	 * Create a class with two methods, one with no return value and the other
	 * with one. Add method comments to each and call them from main.
	 * 
	 * THANk YOU VAL FOR SETTING ME STRAIGHT.
	 */
	public static void main(String[] args) {

		iHaveNoValues();

		int x = haveAValue();
		System.out.println("Method has a value:  " + x);

	}

	public static void iHaveNoValues() {
		/**
		 * This method doesn't return anything
		 */

		System.out.println("This method has no values, so watch out!");
	}

	public static int haveAValue() {
		/**
		 * This method returns an integer
		 */
		int y = 1;
		return y;

	}

}