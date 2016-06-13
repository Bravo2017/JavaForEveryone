package com.nationwide.chapter6.derby;

import java.util.Arrays;

/**
 * P6.1Write a program that initializes an array with ten random integers and
 * then prints four lines of output, containing •Every element at an even index.
 * •Every even element. •All elements in reverse order. •Only the first and last
 * element.
 */

public class P61 {

	static int max1 = 69;
	static int max2 = 26;
	static int min = 1;
	static int[] randomNums = { (int) (Math.random() * (max1 - min) + min),
			(int) (Math.random() * (max1 - min) + min),
			(int) (Math.random() * (max1 - min) + min),
			(int) (Math.random() * (max1 - min) + min),
			(int) (Math.random() * (max2 - min) + min) };

	public static void main(String[] args) {
		// •Every element at an even index.
		for (int i = 0; i < randomNums.length; i++) {
			if (i + 1 != randomNums.length) {
				if (i % 2 == 0) {
					System.out.print(randomNums[i]);
					System.out.print("|");
				}
			} else {
				if (i % 2 == 0) {
					System.out.println(randomNums[i]);
				} else {
					System.out.println();
				}
			}
		}
		// •Every even element.
		for (int i = 0; i < randomNums.length; i++) {
			if (i + 1 != randomNums.length) {
				if (randomNums[i] % 2 == 0) {
					System.out.print(randomNums[i]);
					System.out.print("|");
				}
			} else {
				if (randomNums[i] % 2 == 0) {
					System.out.println(randomNums[i]);
				} else {
					System.out.println();
				}
			}
		}
		// •All elements in reverse order.
		for (int i = randomNums.length - 1; i >= 0; i--) {
			if (i != 0) {
				System.out.print(randomNums[i]);
				System.out.print("|");
			} else {
				System.out.println(randomNums[i]);
			}
		}
		// •Only the first and last element.
		System.out.println(randomNums[0] + "|"
				+ randomNums[randomNums.length - 1]);

		// •For test validation
		System.out.println("Winning Numbers!\n" + Arrays.toString(randomNums));
	}

}
