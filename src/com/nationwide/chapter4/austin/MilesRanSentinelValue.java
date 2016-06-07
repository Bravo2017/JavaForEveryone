package com.nationwide.chapter4.austin;

import java.util.Scanner;

public class MilesRanSentinelValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int sum = 0;
		int value = 0;
		int count = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter miles ran (or 0 to quit):");
		value = in.nextInt();
		while (value != 0) {
			count = count + 1;
			sum = sum + value;
			System.out.println("Total miles so far: " + sum);
			System.out.println("Enter miles ran (or 0 to quit");
			value = in.nextInt();
		}
		System.out.println();
		if (count == 0)
			System.out.println("No amount entered");
		else
			System.out.println("Total miles ran is: " + sum);
	}
}
