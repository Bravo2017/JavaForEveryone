package com.nationwide.chapter6.thurston;

import java.util.*;

public class RemoveMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		for (int i = 1; i < currentSize; i++) {
			if (values[i] < smallest) {
				smallest = values[i];
			}
		}

		for (int i = 0; i < currentSize; i++) {
			if (values[i] == smallest) {
				values[i] = values[currentSize - 1];
			}
		}
		currentSize--;

		for (int i = 0; i < currentSize; i++) {
			System.out.println(values[i]);

		}

		System.out.println();
	}

}