package com.nationwide.chapter6.feight;

import java.util.Scanner;

/**
 * Write a method public static void removeMin that removes the minimum value
 * from a partially filled array without calling other methods
 * 
 * @author Suzanne Feight
 * 
 */

public class P6_5 {

	public static void main(String[] args) {

		final int LENGTH = 100;
		double[] values = new double[LENGTH];
		int currentSize = 0;

		System.out.println("Please enter values, Q to quit:");
		Scanner in = new Scanner(System.in);
		while (in.hasNextDouble() && currentSize < values.length) {
			values[currentSize] = in.nextDouble();
			currentSize++;
		}
		in.close();

		System.out.println("Current size of array: " + currentSize);

		System.out.println("Elements in array:");
		for (int i = 0; i < currentSize; i++) {
			System.out.println("Index " + i + ": " + values[i]);
		}

		System.out.println();
		removeMin(values, currentSize);

	}

	public static void removeMin(double[] a, int size) {

		int newSize = 0;
		double smallest = a[0];
		int indexOfSmallest = 0;

		for (int i = 1; i < size; i++) {
			if (a[i] < smallest) {
				smallest = a[i];
				indexOfSmallest = i;
			}
		}

		System.out.println("The smallest value was: " + smallest);
		System.out.println("The index was: " + indexOfSmallest);

		for (int i = indexOfSmallest + 1; i < size; i++) {
			a[i - 1] = a[i];
		}
		newSize = size - 1;

		System.out.println("The reviese array elements are:");
		for (int i = 0; i < newSize; i++) {
			System.out.println("Index " + i + ": " + a[i]);
		}
	}
}
