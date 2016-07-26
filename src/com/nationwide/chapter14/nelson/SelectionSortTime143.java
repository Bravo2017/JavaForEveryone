package com.nationwide.chapter14.nelson;

import java.util.Scanner;

import com.nationwide.chapter14.StopWatch;

/**
 * P14.3 Program asks for the smallest and largest value of n and the number of
 * measurements to run then automatically generates the table of sample run
 * times for the selection sort algorithm.
 * 
 * @author NELSOT17
 * 
 */
public class SelectionSortTime143 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter smallest array size: ");
		int n = in.nextInt();
		System.out.print("Enter largest array size: ");
		int largest = in.nextInt();
		System.out.print("How many measurements: ");
		int measurements = in.nextInt();

		long[] runTimes = new long[measurements];

		for (int i = 0; i < measurements; i++) {
			// Construct random array
			int[] a = ArrayUtil.randomIntArray(n, largest);

			// Use stopWatch to time selection sort
			StopWatch timer = new StopWatch();

			timer.start();

			SelectionSorter.sort(a);

			timer.stop();

			runTimes[i] = timer.getElapsedTime();
			System.out
					.println("Elapsed time: " + runTimes[i] + " milliseconds");
		}
		in.close();
	}

}
