package com.nationwide.chapter2;

public class FormattedOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		float price = 1.215962441314554f;
		System.out.printf("%15.2f\n", price);

		int quantity = 34;
		System.out.printf("Quantity %5d\n", quantity);

		int bottles = 14;
		int cans = 20;
		System.out.printf("Bottles: %6d\n", bottles);
		System.out.printf("Cans:    %6d\n", cans);

	}

}
