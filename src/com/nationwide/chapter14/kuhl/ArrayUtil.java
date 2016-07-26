package com.nationwide.chapter14.kuhl;

import java.util.Random;

public class ArrayUtil {

	private static Random generator = new Random();

	/**
	 * Creates an array filled with random values.
	 * 
	 * l: length of array * n : the number of possible random values
	 * 
	 * @return an array filled with length numbers between 0 and n - 1
	 */

	public static int[] randomIntArray(int length, int n) {
		int[] arrayOfCoins = new int[length];
		for (int i = 0; i < arrayOfCoins.length; i++) {
			arrayOfCoins[i] = generator.nextInt(n);
		}

		return arrayOfCoins;
	}

	/**
	 * Swaps two entries of an array.
	 * 
	 * i : the first position to swap j : the second position to swap
	 */

	public static void swap(int[] arrayOfCoins, int i, int j) {
		int temp = arrayOfCoins[i];
		arrayOfCoins[i] = arrayOfCoins[j];
		arrayOfCoins[j] = temp;
	}
}
