package com.nationwide.chapter14.thurston;

import java.util.Arrays;

public class FourteenPointTwoDemo {

	/**
	 * This program demonstrates the selection sort algorithm by sorting an
	 * array that is filled with random numbers.
	 */

	public static void main(String[] args) {
		int[] a = CoinArray.coinIntArray(26, 26);
		System.out.println(Arrays.toString(a));

		FourteenPointTwo.sort(a);

		System.out.println(Arrays.toString(a));
	}
}
