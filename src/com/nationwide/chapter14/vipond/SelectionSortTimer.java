package com.nationwide.chapter14.vipond;

import java.util.Scanner;

import com.nationwide.chapter14.ArrayUtil;

/**
 * This program measures how long it takes to sort an array of a user-specified
 * size with the selection sort algorithm.
 */
public class SelectionSortTimer {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out
				.print("Enter smallest number of elements in array to sort: ");
		int low = in.nextInt();
		System.out.print("Enter largest number of elements in array to sort: ");
		int high = in.nextInt();
		System.out
				.print("Enter number of selection sorts you want to run between these two: ");
		int totalcount = in.nextInt();

		int diff = high - low;
		int diffcount = diff / (totalcount - 1);

		System.out.println();
		System.out.println("   NUM     Milliseconds");

		int value = low;
		for (int count = 0; count < totalcount; count++) {
			// Construct random array
			if (count + 1 == totalcount) {
				value = high;
			}
			int[] a = ArrayUtil.randomIntArray(value, 100);

			// Use stopwatch to time selection sort
			StopWatch timer = new StopWatch();

			timer.start();
			SelectionSorter2.sort(a);
			timer.stop();

			System.out.printf("%8d", value);
			System.out.printf("%10d", timer.getElapsedTime());
			System.out.println();
			value = value + diffcount;
		}

	}
}
