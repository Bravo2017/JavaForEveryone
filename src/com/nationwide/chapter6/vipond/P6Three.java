package com.nationwide.chapter6.vipond;

/*
 * Modify the LargestInArray.java program in Section 6.3 to mark both the smallest and the largest elements.
 */

import java.util.Scanner;

public class P6Three {

	public static void main(String[] args) {
		final int LENGTH = 100;
		double[] values = new double[LENGTH];
		int currentSize = 0;

		// Read inputs

		System.out.println("Please enter values, Q to quit:");
		Scanner in = new Scanner(System.in);
		while (in.hasNextDouble() && currentSize < values.length) {
			values[currentSize] = in.nextDouble();
			currentSize++;
		}

		// Find the smallest value
		double smallest = values[0];
		for (int i = currentSize - 1; i >= 0; i--) {
			if (values[i] < smallest) {
				smallest = values[i];
			}
		}

		// Find the largest value
		double largest = values[0];
		for (int i = 1; i < currentSize; i++) {
			if (values[i] > largest) {
				largest = values[i];
			}
		}

		// Print all values, marking the largest & smallest
		for (int i = 0; i < currentSize; i++) {
			System.out.print(values[i]);
			if (values[i] == largest) {
				System.out.print(" <== largest value");
			}
			if (values[i] == smallest) {
				System.out.print(" <== smallest value");
			}
			System.out.println();
		}
	}
}
