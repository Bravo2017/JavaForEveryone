package com.nationwide.chapter14.williams;

import java.util.Arrays;

public class CoinSorter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] a = { 5, 25, 10, 50, 1 };
		System.out.println(Arrays.toString(a));

		SelectionSorter.sort(a);
		System.out.println(Arrays.toString(a));
	}

}