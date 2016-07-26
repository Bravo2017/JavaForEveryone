package com.nationwide.chapter14.nelson;

import java.util.Arrays;

/**
 * This program demonstrates the selection sort algorithm by sorting an array
 * that is filled with random numbers.
 */
public class SelectionSortDemo {
	public static void main(String[] args) {
		int[] a = ArrayUtil.randomIntArray(20, 100);
		System.out.println(Arrays.toString(a));

		SelectionSorter.sort(a);

		System.out.println(Arrays.toString(a));
		System.out.println(" ");

		// 14.2 sort array of coins by value
		double[] coins = { .25, .10, .50, .01, 1.00, .05 };

		System.out.print("Conis before sort");
		for (int i = 0; i < coins.length; i++) {
			System.out.printf("% .2f", coins[i]);
		}
		System.out.println("  ");

		SelectionSorter.sortDouble(coins);

		System.out.print("Coins after sort ");
		for (int i = 0; i < coins.length; i++) {
			System.out.printf("% .2f", coins[i]);
		}

	}
}