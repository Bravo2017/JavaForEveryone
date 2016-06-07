package com.nationwide.chapter2.vanwyk;

import java.util.Scanner;

public class UserInputPrompt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter number of fireworks: "); // this will
																// prompt for
																// input
		int fireworks = in.nextInt(); // this takes the users input and assigns
										// to integer"fireworks"

		System.out.print("Enter price: "); // this will then prompt user for
											// price input
		double price = in.nextDouble(); // this will take input and assign to
										// double "price"

		// this will display the total price of the purchase
		System.out.print("Your firework purchase price is: $" + fireworks
				* price);

	}

}
