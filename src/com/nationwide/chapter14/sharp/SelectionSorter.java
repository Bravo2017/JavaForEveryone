package com.nationwide.chapter14.sharp;

import java.util.Arrays;

public class SelectionSorter {
	//
	private Coin[] list;

	/**
	 * Constructs a selection sorter.
	 * 
	 * @param anArray
	 *            the array to sort.
	 */
	public SelectionSorter(Coin[] anArray) {
		list = anArray;
	}

	public String toString() {
		return Arrays.toString(list);
	}

	/**
	 * Finds the largest coin in an array range.
	 * 
	 * @param from
	 *            the first position in a to compare
	 * @return the position of the largest coin in the range a[from] . . .
	 *         a[a.length - 1]
	 */
	public int maximumPosition(int from) {
		int max = from;
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i].getValue() > list[max].getValue()) {
				max = i;
			}
		}
		return max;
	}

	/**
	 * Sorts an array.
	 */
	public void sort() {
		for (int i = 0; i < list.length - 1; i++) {
			int max = maximumPosition(i);
			swap(i, max);
		}
	}

	/**
	 * Swaps two entries of the array.
	 * 
	 * @param i
	 *            the first position to swap
	 * @param j
	 *            the second position to swap
	 */
	public void swap(int i, int j) {
		Coin temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}