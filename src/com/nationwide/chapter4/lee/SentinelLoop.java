package com.nationwide.chapter4.lee;

import java.util.Scanner;

public class SentinelLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Variable declaration
		int number = 20;
		int sum = 0;

		Scanner keyboard = new Scanner(System.in);

		while (number != 0) {
			System.out.println("Enter a number to add (Press 0 to quit): ");
			number = keyboard.nextInt();

			if (number == 0) {
				System.out
						.println("\nThe sum of numbers entered before zero is "
								+ sum + ".");
			}

			sum = sum + number; // Get sum

		}
	}

}
