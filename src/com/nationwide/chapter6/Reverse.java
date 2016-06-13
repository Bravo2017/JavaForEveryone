package com.nationwide.chapter6;

import java.util.Scanner;

public class Reverse {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		double[] numbers = readInputs(5);
		multiply(numbers, 10);
		printReversed(numbers);

		double number = readInput();
		multiply(number, 10);
		printNumber(number);
	}

	/**
	 * Reads a sequence of floating-point numbers.
	 * 
	 * @param numberOfInputs
	 *            the number of inputs to read
	 * @return an array containing the input values
	 */
	public static double[] readInputs(int numberOfInputs) {
		System.out.println("Enter " + numberOfInputs + " numbers: ");
		Scanner in = new Scanner(System.in);
		double[] inputs = new double[numberOfInputs];
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = in.nextDouble();
		}
		return inputs;
	}

	public static double readInput() {
		System.out.println("Enter 1 number: ");
		Scanner in = new Scanner(System.in);
		double input = 0;
		input = in.nextDouble();
		return input;
	}

	/**
	 * Multiplies all elements of an array by a factor.
	 * 
	 * @param values
	 *            an array
	 * @param factor
	 *            the value with which element is multiplied
	 */
	public static void multiply(double[] values, double factor) {
		for (int i = 0; i < values.length; i++) {
			values[i] = values[i] * factor;
		}
	}

	private static void multiply(double value, double factor) {
		value = value * factor;
		System.out.println(value);
	}

	/**
	 * Prints an array in reverse order.
	 * 
	 * @param values
	 *            an array of numbers
	 * @return an array that contains the elements of values in reverse order
	 */
	public static void printReversed(double[] values) {
		// Traverse the array in reverse order, starting with the last element
		for (int i = values.length - 1; i >= 0; i--) {
			System.out.print(values[i] + " ");
		}
		System.out.println();
	}

	private static void printNumber(double value) {
		System.out.print(value + " ");
	}
}