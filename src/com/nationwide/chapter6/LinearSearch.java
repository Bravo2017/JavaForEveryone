package com.nationwide.chapter6;

public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] values = { 45, 72, 31, 44, 100, 51, 66 };
		int searchedValue = 100;
		int pos = 0;
		boolean found = false;
		while (pos < values.length && !found) {
			if (values[pos] == searchedValue) {
				found = true;
			} else {
				pos++;
			}
		}
		if (found) {
			System.out.println("Found at position: " + pos);
		} else {
			System.out.println("Not found");
		}
	}

}
