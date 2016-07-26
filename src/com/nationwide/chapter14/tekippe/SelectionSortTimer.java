package com.nationwide.chapter14.tekippe;

import java.util.Scanner;

/**
 * This program measures how long it takes to sort an array of a user-specified
 * size with the selection sort algorithm.
 */
public class SelectionSortTimer {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter minimum array size: ");
		int min = in.nextInt();

		System.out
				.print("Enter maximum array size(must be bigger than minimum): ");
		int max = in.nextInt();

		System.out.print("Enter the number of arrays to test: ");
		int num = in.nextInt();

		System.out.println("Array size        Elapsed time ");

		int spread = max - min;
		int increment = spread / (num - 1);
		int n = min;

		for (int i = 1; i <= num; i++) {
			// Construct random array

			int[] a = ArrayUtil2.randomIntArray(n, 100);

			// Use stopwatch to time selection sort

			StopWatch timer = new StopWatch();

			timer.start();
			SelectionSorter2.sort(a);
			timer.stop();

			System.out.println("  " + n + "            "
					+ timer.getElapsedTime() + " milliseconds");
			n = n + increment;
		}
	}
}
