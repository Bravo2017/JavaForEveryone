package com.nationwide.chapter6.williams;

import java.util.Scanner;

public class AssignmentThree {

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
	}

	public static void removeMin(double[] array, int size) {
		// find the smallest
		double smallest = array[0];
		for (int i = 1; i < size; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}

		// remove the smallest

		for (int i = 0; i < size; i++) {
			System.out.print(array[i]);
			if (array[i] == smallest) {
				System.out.print(" <== largest value");
			}
		}
	}

}
