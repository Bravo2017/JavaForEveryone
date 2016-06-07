package com.nationwide.chapter3.matt;

public class AssignmentTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int price = 2;

		switch (price) {
		case 10:
			System.out.println("Price is:  " + price + ".");
			break;
		case 5:
			System.out.println("Price is:  " + price
					+ " which is greater than 5 but less then 10.");
			break;
		case 1:
			System.out.println("Price is:  " + price + " which is too low.");
			break;
		case 0:
			System.out.println("Price is:  " + price + " which is just right.");
			break;
		default:
			System.out.println("Price is:  " + price + " which is just right.");
			break;
		}
	}

}
