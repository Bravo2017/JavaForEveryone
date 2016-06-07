package com.nationwide.chapter5.mardis;

public class TestReturnValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String first = "Nothing returned from this method";
		noReturn(first);

		int x = 15;

		boolean result = evenOrOdd(x);
		if (result == true) {
			System.out.println(x + " is even");
		} else {
			System.out.println(x + " is odd");
		}

	}

	/**
	 * displays the text that was passed into it
	 * 
	 * @param s
	 *            the string value
	 */
	public static void noReturn(String s) {
		System.out.println("This method does not return anything");
		System.out.println("It was passed in the string of - " + s);
	}

	/**
	 * calculates if a number is odd or even
	 * 
	 * @param i
	 *            the number to be evaluated
	 * @return a boolean of true if the number is even and false if its odd
	 */
	public static boolean evenOrOdd(int i) {
		double remainder = i % 2;
		if (remainder == 0) {
			return true;
		} else {
			return false;
		}
	}

}