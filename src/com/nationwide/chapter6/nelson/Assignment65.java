package com.nationwide.chapter6.nelson;

import java.util.Scanner;

public class Assignment65 {

	/*
	 * Write a method public static void removeMin that removes the minimum
	 * value from a partially filled array without calling other methods
	 */
	public Assignment65() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// define an array to hold up to 10 elements
		final int LENGTH = 10;
		double[] values = new double[LENGTH];
		int currentSize = 0;

		// request console input of array elements
		System.out.println("Please enter values, Q to quit: ");
		Scanner in = new Scanner(System.in); // why resource leak: 'in' never
												// closed
		while (in.hasNextDouble() && currentSize < LENGTH - 1) {
			values[currentSize] = in.nextDouble();
			currentSize++;
		}
		System.out.println("Data has been gathered for " + currentSize
				+ " elements");

		// display the before array
		System.out.print("Before array has values of: ");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		System.out.println("  ");

		// execute method to remove minimum value
		removeMin(values);

		// display the after array
		System.out.println("  ");
		System.out.print(" After array has values of: ");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}

	}

	/**
	 * Remove the minimum non-zero value from a double array
	 * 
	 * @param values
	 *            - array of numbers entered on the console
	 */
	public static void removeMin(double[] values) {
		// find minimum number in the value array
		boolean done = false;
		int minIndex = 1;
		double minimum = values[0];
		int position = 0;
		while (!done && minIndex < values.length) {
			if (values[minIndex] == 0.0) {
				done = true;
			} else {
				if (values[minIndex] < minimum) {
					minimum = values[minIndex];
					position = minIndex;
				}
				minIndex = minIndex + 1;
			}
		}
		System.out.println("  ");
		System.out.println("Minimum value: " + minimum + " at index "
				+ position);

		// remove the minimum number from the values array
		for (int i = position + 1; i <= minIndex; i++) {
			values[i - 1] = values[i];
		}
	}
}
