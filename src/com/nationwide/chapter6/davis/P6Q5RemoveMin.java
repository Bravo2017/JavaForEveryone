package com.nationwide.chapter6.davis;

public class P6Q5RemoveMin {

	/**
	 * P6.5 Write a method public static void removeMin that removes the minimum
	 * value from a partially filled array without calling other methods.
	 */
	public static void main(String[] args) {

		removeMin();
	}

	// removeMin
	public static void removeMin() {
		// Initializes an array with ten random integers
		int[] p6Q5RemoveMin = new int[10];
		p6Q5RemoveMin[((int) (Math.random() * 10))] = (int) (Math.random() * 10);
		p6Q5RemoveMin[((int) (Math.random() * 10))] = (int) (Math.random() * 10);
		p6Q5RemoveMin[((int) (Math.random() * 10))] = (int) (Math.random() * 10);
		p6Q5RemoveMin[((int) (Math.random() * 10))] = (int) (Math.random() * 10);
		p6Q5RemoveMin[((int) (Math.random() * 10))] = (int) (Math.random() * 10);
		p6Q5RemoveMin[((int) (Math.random() * 10))] = (int) (Math.random() * 10);
		p6Q5RemoveMin[((int) (Math.random() * 10))] = (int) (Math.random() * 10);
		System.out.println(" ");
		System.out
				.println("Initializes a 10 element array with random integers");
		for (int i = 0; i < 10; i++) {
			if (i > 0) {
				System.out.print(" | ");
			}
			System.out.print(i + " = ");
			System.out.print(p6Q5RemoveMin[i]);
		}
		// Find minimum value.
		int smallest = p6Q5RemoveMin[0];
		for (int i = 1; i < p6Q5RemoveMin.length; i++) {
			if (p6Q5RemoveMin[i] < smallest) {
				smallest = p6Q5RemoveMin[i];
			}
		}
		// Removing the Minimum Value Elements
		int p6Q5currentSize = p6Q5RemoveMin.length;
		for (int i = 0; i <= p6Q5currentSize - 1; i++) {
			if (p6Q5RemoveMin[i] == smallest) {
				// We want to remove this element
				for (int i2 = p6Q5currentSize - 1; i2 >= i; i2--) {
					// Do we want to use this element
					if (p6Q5RemoveMin[i2] != smallest) {
						// Yes, replace and get out of this if
						p6Q5RemoveMin[i] = p6Q5RemoveMin[i2];
						p6Q5RemoveMin[i2] = 0;
						i2 = 0;
					}
					p6Q5currentSize--;
				}
			}
		}
		// New Array with Minimum Values Removed
		System.out.println("\nNew Array with Minimum Values Removed");
		for (int i3 = 0; i3 < (p6Q5currentSize); i3++) {
			if (i3 > 0) {
				System.out.print(" | ");
			}
			System.out.print(i3 + " = ");
			System.out.print(p6Q5RemoveMin[i3]);
		}

	}
}