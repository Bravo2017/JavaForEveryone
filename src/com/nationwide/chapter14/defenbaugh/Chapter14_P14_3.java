package com.nationwide.chapter14.defenbaugh;

import java.util.Scanner;

public class Chapter14_P14_3 {

	/**
	 * author: Valerie Defenbaugh Write a program that automatically generates
	 * the table of sample run times for the selection sort algorithm. The
	 * program should ask for the smallest and largest value of n and the number
	 * of measurements and then make all sample runs.
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the smallest value of n:");
		int smallN = in.nextInt();
		System.out.print("Enter the largest value of n:");
		int largeN = in.nextInt();
		System.out.print("Enter the number of measurements:");
		int numMeasurements = in.nextInt();

		System.out.printf(String.format("%-20s %-20s \n", "Iteration",
				"Results"));
		System.out.printf(String.format("%-53s \n",
				"----------------------------"));
		// System.out.println("");

		int increment = ((largeN + 1) - smallN) / (numMeasurements);

		int n = smallN;

		while (n <= largeN) {
			// Construct an array filled with random values where n is the
			// length of the array
			// and 100 is the number of possible random values

			int[] a = ArrayUtil.randomIntArray(n, 1000);

			// Use stopwatch to time selection sort

			// System.out.println(Arrays.toString(a));

			StopWatch timer = new StopWatch();

			timer.start();
			SelectionSorter.sort(a);
			timer.stop();

			System.out.printf(String.format("%-20s %-20s \n", n,
					timer.getElapsedTime() + " milliseconds"));

			// System.out.println(Arrays.toString(a));

			// System.out.println("Elapsed time: " + timer.getElapsedTime()
			// + " milliseconds");

			n = n + increment;
		}
	}
}