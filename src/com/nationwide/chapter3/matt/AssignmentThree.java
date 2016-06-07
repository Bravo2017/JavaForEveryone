package com.nationwide.chapter3.matt;

public class AssignmentThree {

	public static void main(String[] args) {
		LiqourPrice price = LiqourPrice.RED;
		boolean happyHour = true;

		if (price == LiqourPrice.BLACK) {
			if (happyHour) {
				System.out.println("Price is:  $4.50");
			} else {
				System.out.println("Price is:  $5.00");
			}
		} else if (price == LiqourPrice.BLUE) {
			if (happyHour) {
				System.out.println("Price is:  $4.00");
			} else {
				System.out.println("Price is:  $4.50");
			}
		} else if (price == LiqourPrice.GREEN) {
			if (happyHour) {
				System.out.println("Price is:  $3.50");
			} else {
				System.out.println("Price is:  $4.00");
			}
		} else if (price == LiqourPrice.RED) {
			if (happyHour) {
				System.out.println("Price is:  $3.25");
			} else {
				System.out.println("Price is:  $3.75");
			}
		} else if (price == LiqourPrice.YELLOW) {
			if (happyHour) {
				System.out.println("Price is:  $3.25");
			} else {
				System.out.println("Price is:  $2.75");
			}
		}
	}

	public enum LiqourPrice {
		YELLOW, RED, GREEN, BLUE, BLACK
	}
}