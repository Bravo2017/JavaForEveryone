package com.nationwide.chapter14.feight;

import java.util.Scanner;

/**
 * Write a program that automatically generates the table of sample run times for the selection sort algorithm.
 * The program should ask for the smallest and largest value of n and 
 * the number of measurements and then make all sample runs.
 * 
 * @author Suzanne Feight
 *
 */

public class SelectionSortResults {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of sort runs to test: ");
		int n = in.nextInt();
		
		StopWatch mainWatch = new StopWatch();
		StopWatch runWatch = new StopWatch();
		
		mainWatch.start();
		
		for (int i = 1; i <= n; i++ ) {
			runWatch.start();
			double[] coins = ArrayUtil.getUnsortedCoinArray();
			SelectionSorter.sort(coins);
			runWatch.stop();
			System.out.println("Sample Run: " + i + " Time: " + runWatch.getElapsedTime() + " milliseconds.");
			runWatch.reset();
		}
		mainWatch.stop();
		System.out.println("Total Elasped Time: " + mainWatch.getElapsedTime() + " milliseconds.");
		
	}

}
