package com.nationwide.chapter14.davis;

import java.util.Arrays;

/**
 * Modify the selection sort algorithm to sort an array of coins by their value.
 * 
 * @author DAVISK51
 * 
 */

public class P14Q2SortDemo {

public static void main(String[] args) {
		P14Q2Sort();
	}

	public static void P14Q2Sort() {

		double[] coins = P14Q2ArrayUtil.fillArray();
		System.out.print("Array before : ");
		System.out.println(Arrays.toString(coins));
		P14Q2Sort.sort(coins);
		System.out.print("Array after  : ");
		System.out.println(Arrays.toString(coins));

	}

}
