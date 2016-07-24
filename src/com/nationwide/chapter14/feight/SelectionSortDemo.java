package com.nationwide.chapter14.feight;

import java.util.Arrays;

/**
 * Modify the selection sort algorithm to sort an array of coins by their value.
 * 
 * @author Suzanne Feight
 */

public class SelectionSortDemo {
	
	public static void main(String[] args) {
		
		double[] coins = ArrayUtil.getUnsortedCoinArray();
		
		System.out.println("Original order: " + Arrays.toString(coins));

		SelectionSorter.sort(coins);

		System.out.println("Sorted Order: " + Arrays.toString(coins));
	}
}