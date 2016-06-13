package com.nationwide.chapter6.davis;

public class P6Q3ModifyLengthInArray {

	/**
	 * P6.3 Modify the LargestInArray.java program in Section 6.3 to mark both
	 * the smallest and the largest elements.
	 */
	public static void main(String[] args) {
		// Initializes an array with ten random integers
		int[] p6Q3Value = new int[] { (int) (Math.random() * 5),
				(int) (Math.random() * 5), (int) (Math.random() * 5),
				(int) (Math.random() * 5), (int) (Math.random() * 5),
				(int) (Math.random() * 5), (int) (Math.random() * 5),
				(int) (Math.random() * 5), (int) (Math.random() * 5),
				(int) (Math.random() * 5) };

		System.out.println(" ");
		System.out.println("Initializes an array with ten random integers");
		for (int i = 0; i < 10; i++) {
			if (i > 0) {
				System.out.print(" | ");
			}
			System.out.print(i + " = ");
			System.out.print(p6Q3Value[i]);
		}

		// Mark both the smallest and the largest elements.
		System.out.println(" ");
		int smallest = p6Q3Value[0];
		int smallestElement = 0;
		for (int i = 1; i < p6Q3Value.length; i++) {
			if (p6Q3Value[i] < smallest) {
				smallest = p6Q3Value[i];
				smallestElement = i;
			}
		}
		System.out.println("\nThe Smallest is " + smallest + " in Element "
				+ smallestElement);

		int largest = p6Q3Value[0];
		int largestElement = 0;
		for (int i = 1; i < p6Q3Value.length; i++) {
			if (p6Q3Value[i] > largest) {
				largest = p6Q3Value[i];
				largestElement = i;
			}
		}
		System.out.println("\nThe Largest is " + largest + " in Element "
				+ largestElement);
	}
}
