package com.nationwide.chapter14.kuhl;

/**
 * The sort method of this class sorts an array, using the selection sort
 * algorithm
 * 
 */

public class SelectionSort {

	/**
	 * Sorts an array, using selection sort.
	 * 
	 * 
	 */
	public static void sort(int[] arrayOfCoins) {
		for (int i = 0; i < arrayOfCoins.length - 1; i++) {
			int minPos = minimumPosition(arrayOfCoins, i);
			ArrayUtil.swap(arrayOfCoins, minPos, i);
		}
	}

	/**
	 * Finds the smallest element in a tail range of the array.
	 * 
	 * @param from
	 *            the first position in a to compare
	 * @return the position of the smallest element in the range a[from] . . .
	 *         a[a.length - 1]
	 */
	private static int minimumPosition(int[] arrayOfCoins, int from) {
		int minPos = from;
		for (int i = from + 1; i < arrayOfCoins.length; i++) {
			if (arrayOfCoins[i] < arrayOfCoins[minPos]) {
				minPos = i;
			}
		}
		return minPos;
	}
}