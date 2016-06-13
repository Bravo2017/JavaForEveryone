package com.nationwide.chapter6.davis;

public class P6Q1ArrayRandom {

	/**
	 * P6.1 Write a program that initializes an array with ten random ints and
	 * then prints four lines of output, containing •Every element at an even
	 * index. •Every even element. •All elements in reverse order. •Only the
	 * first and last element.
	 */

	public static void main(String[] args) {
		// Initializes an array with ten random integers
		int[] p6Q1Array = new int[] { (int) (Math.random() * 5),
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
			System.out.print(p6Q1Array[i]);
		}

		// Every element at an even index.
		System.out.println("\n ");
		System.out.println("Every element at an even index.");
		for (int i = 0; i < 10;) {
			System.out.print("Element #" + i);
			System.out.println(" = " + p6Q1Array[i]);
			i = i + 2;
		}

		System.out.println(" ");
		System.out.println("Every even element.");
		for (int i = 0; i < 10; i++) {
			if (p6Q1Array[i] % 2 == 0) {
				System.out.print("Element #" + i);
				System.out.println(" = " + p6Q1Array[i]);
			}

		}

		// All elements in reverse order.
		System.out.println(" ");
		System.out.println("All elements in reverse order.");
		for (int i = 9; i >= 0; i--) {
			System.out.print("Element #" + i);
			System.out.println(" = " + p6Q1Array[i]);
		}

		// Only the first and last element.
		System.out.println(" ");
		System.out.println("Only the first and last element.");
		System.out.println("Element # 0 = " + p6Q1Array[0]);
		System.out.println("Element # " + (p6Q1Array.length - 1) + " = "
				+ (p6Q1Array[(p6Q1Array.length - 1)]));

	}
}
