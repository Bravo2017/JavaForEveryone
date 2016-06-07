package com.nationwide.chapter2.vanwyk;

public class FormattedOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float a = 1.32413f;
		String b = "abcdefghij";
		int c = 2523523;

		System.out.printf("%.2f", a); // this is formatting output of float
										// 1.32413 to the .2 decimal place

		System.out.printf("\n %.5s", b);// this formats string to .5th character
										// starting with 0

		System.out.printf("\n Number spacing:----> %30d", c);

		System.out.println("");

		String firstName = "Austin";
		String lastName = " VanWyk";
		System.out.println("My name is: " + firstName + lastName);

		String greeting = "Hello World!";
		String sub = greeting.substring(0, 7);

		System.out.println(sub);
	}

}