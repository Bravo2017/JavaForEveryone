package com.nationwide.chapter14.williams;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortTester {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter lowest number in array:  ");
		int lowest = in.nextInt();
		System.out.print("Enter highest number in array:  ");
		int highest = in.nextInt();
		System.out.print("Enter 1st measurement:  ");
		int measurementOne = in.nextInt();
		System.out.print("Enter 2nd measurement:  ");
		int measurementTwo = in.nextInt();
		System.out.print("Enter 3rd measurement:  ");
		int measurementThree = in.nextInt();

		int[] a = ArrayUtil.randomIntArray(measurementOne, lowest, highest);
		System.out.println(Arrays.toString(a));

		StopWatch timer = new StopWatch();

		timer.start();
		SelectionSorter.sort(a);
		timer.stop();

		System.out.println(Arrays.toString(a));
		System.out.println("Elapsed time:  " + timer.getElapsedTime()
				+ " milliseconds");

		int[] b = ArrayUtil.randomIntArray(measurementTwo, lowest, highest);
		System.out.println(Arrays.toString(b));

		timer.reset();

		timer.start();
		SelectionSorter.sort(b);
		timer.stop();

		System.out.println(Arrays.toString(b));
		System.out.println("Elapsed time:  " + timer.getElapsedTime()
				+ " milliseconds");

		int[] c = ArrayUtil.randomIntArray(measurementThree, lowest, highest);
		System.out.println(Arrays.toString(c));

		timer.reset();

		timer.start();
		SelectionSorter.sort(c);
		timer.stop();

		System.out.println(Arrays.toString(c));
		System.out.println("Elapsed time:  " + timer.getElapsedTime()
				+ " milliseconds");
	}

}