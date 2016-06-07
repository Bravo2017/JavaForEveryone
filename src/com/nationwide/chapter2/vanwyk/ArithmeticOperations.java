package com.nationwide.chapter2.vanwyk;

public class ArithmeticOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 5;
		int d = 10;

		int e = (a + b);
		int f = (b * d);
		int g = (d / c);
		int h = (d - b);

		System.out.println("The value of e is :" + e);
		System.out.println("The value of f is :" + f);
		System.out.println("The value of g is :" + g);
		System.out.println("The value of h is :" + h);

		// below are examples of incrementing and decrementing variables
		int incrementTotal = 100;
		incrementTotal++;

		int decrementingTotal = 100;
		decrementingTotal--;

		System.out.println(incrementTotal);
		System.out.println(decrementingTotal);

		// below shows the use of an operator called modulus(%) this calculates
		// remainders
		int pennies = 4375;
		int dollars = (pennies / 100);
		int cents = (pennies % 100);

		// using the modulus you can easily display a $ outprint
		System.out.println("With 4,375 pennies I have: " + dollars
				+ " dollars and " + cents + " cents");

	}

}
