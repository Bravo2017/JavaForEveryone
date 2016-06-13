package com.nationwide.chapter6.raush;

import java.util.Random;

public class Assignment3 {

	/**
	 * Write a method public static void removeMin that removes the minimum
	 * value from a partially filled array without calling other methods.
	 * 
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int array[] = new int[10];

		/*
		 * Populate array with random numbers - only populate 7 values into
		 * array that holds 10 Print the values in the array
		 */
		System.out.println("partial Array of 10 element array: ");
		for (int i = 0; i < array.length - 3; i++) {
			array[i] = random.nextInt(50);
			System.out.print(array[i] + " ");
		}
		/* call function to remove the smallest number in the array */
		removeMin(array);
	}

	/* Function to remove the the smallest int in the array (excluding zeroes) */
	public static void removeMin(int[] value) {
		int minElement = value[0];
		int minIndex = 0;
		/* identify the smallest int in the array (excluding zeroes) */
		for (int i = 1; i < value.length; i++) {
			if (value[i] != 0 && value[i] < minElement) {
				minElement = value[i];
				minIndex = i;
			}
		}

		/* Remove the minimum number in the passed array */
		for (int i = minIndex; i < value.length - 1; i++) {
			value[i] = value[i + 1];

		}
		/*
		 * Print values of array now that the Remove the minimum number in the
		 * passed array
		 */
		System.out.println(" ");
		System.out.print("remove minimum value from array:");
		System.out.println(" ");
		for (int i = 0; i < value.length; i++) {
			System.out.print(value[i] + " ");
		}
	}
}
