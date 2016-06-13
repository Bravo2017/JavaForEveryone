package com.nationwide.chapter6.vipond;

/*
 * Write a method public static void removeMin that removes the minimum value from a partially filled array without calling other methods
 */

public class P6Five {

	public static void main(String[] args) {

		int[] intarray = { 38, 9, 991, 6, 27, 4, 80, 2, 11, 777 };
		int currentsize = intarray.length;
		System.out
				.println("List of integers BEFORE removing the smallest value");
		for (int i = 0; i < currentsize; i++) {
			System.out.print(intarray[i] + "  ");
		}
		for (int x = 0; x < currentsize;) {
			System.out.println();
			removeMin(intarray);
			currentsize--;
			System.out
					.println("List of integers AFTER removing the smallest value");
			for (int i = 0; i < currentsize; i++) {
				System.out.print(intarray[i] + "  ");
			}
		}
	}

	public static void removeMin(int[] values) {
		// Find the smallest value
		double smallest = values[0];
		int indexnum = 0;
		for (int i = values.length - 1; i >= 0; i--) {
			if (values[i] < smallest) {
				smallest = values[i];
				indexnum = i;
			}
		}
		for (int i = indexnum + 1; i < values.length; i++) {
			values[i - 1] = values[i];
		}

	}

}
