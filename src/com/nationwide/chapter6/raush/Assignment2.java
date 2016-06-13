package com.nationwide.chapter6.raush;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {

	/**
	 * Modify the LargestInArray.java program in Section 6.3 to mark both the
	 * smallest and the largest elements
	 */
	public static void main(String[] args) {
		ArrayList<Double> values = new ArrayList<Double>();

		// Read inputs

		System.out.println("Please enter values, Q to quit:");
		Scanner in = new Scanner(System.in);
		while (in.hasNextDouble()) {
			values.add(in.nextDouble());
		}

		// Find the largest value

		double largest = values.get(0);
		double smallest = values.get(0);

		for (int i = 1; i < values.size(); i++) {
			if (values.get(i) > largest) {
				largest = values.get(i);
			} else if (values.get(i) < smallest) {
				smallest = values.get(i);
			}

		}

		// Print all values, marking the largest and the smallest

		for (double element : values) {
			System.out.print(element);
			if (element == largest) {
				System.out.print(" <== largest value");
			}
			if (element == smallest) {
				System.out.print(" <== smallest value");
			}
			System.out.println();
		}

	}

}
