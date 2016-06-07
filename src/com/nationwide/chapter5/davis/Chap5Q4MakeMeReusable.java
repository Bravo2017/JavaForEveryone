package com.nationwide.chapter5.davis;

import java.util.Scanner;

/**
 * 4. Take the class called MakeMeReusable.java and re-work the code to add a
 * new method so it is easier to use and read.
 */
public class Chap5Q4MakeMeReusable {
	static double totalPrice = 0;
	static double price = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Enter first item
		System.out.print("First item price: ");

		// Use Total Price Method to
		// add each additional item to the total price
		while (price != -1) {
			price = in.nextDouble();
			if (price != -1) {
				totalPriceMethod(price);
			}
		}

		// After all items are entered get tax from total price

		if (totalPrice > 0) { // Make sure at least 1 price entered
			System.out.print("Tax rate in percent: ");
			double rate = in.nextDouble();
			double tax = totalPrice * rate / 100;
			System.out.printf("Tax amount: $%.2f", tax);
			System.out.printf("\nAmount due: $%.2f", (totalPrice + tax));
		} else { // If no prices entered do this
			System.out
					.println("You have not entered an item price.  Please, start again.");
		}
	}

	// Add each item to the total price
	public static double totalPriceMethod(double price) {
		totalPrice = totalPrice + price;
		System.out.printf("Current Total: $%.2f", totalPrice);
		System.out.print("\nEnter -1 to finish or enter next item's price: ");
		return totalPrice;

	};
}