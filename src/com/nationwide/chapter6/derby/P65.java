package com.nationwide.chapter6.derby;

import java.util.Arrays;
import java.util.Scanner;

/**
 * • P6.5Write a method public static void removeMin that removes the minimum
 * value from a partially filled array without calling other methods.
 */
public class P65 {
	static int arraySize = 0;
	static int[] array = new int[100];

	public static void removeMin(int[] a) {
		int smallestValue = a[0];
		int smallestSub = 0;
		for (int i = 1; i < arraySize; i++) {
			if (array[i] < smallestValue) {
				smallestValue = array[i];
				smallestSub = i;
			}
		}
		for (int i = smallestSub; i < arraySize - 1; i++) {
			a[i] = a[i + 1];
		}
		arraySize--;
		array[arraySize] = 0;

	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter some integers, enter Q to quit");
		while (in.hasNextInt() && arraySize < array.length) {
			array[arraySize] = in.nextInt();
			arraySize++;
		}
		removeMin(array);
		System.out.println(Arrays.toString(array));
		System.out.println("Array Size is " + arraySize);
	}
}
