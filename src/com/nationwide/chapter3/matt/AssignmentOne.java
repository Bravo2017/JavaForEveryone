package com.nationwide.chapter3.matt;

public class AssignmentOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int price = 2;

		if (price > 10) {
			System.out.println("Price is:  " + price
					+ " which is greater than 10.");
		} else if (price > 5) {
			System.out.println("Price is:  " + price
					+ " which is greater than 5 but less then 10.");
		} else if (price == 1) {
			System.out.println("Price is:  " + price + " which is too low.");
		} else if (price != 0) {
			System.out.println("Price is:  " + price + " which is just right.");
		}

	}

}
