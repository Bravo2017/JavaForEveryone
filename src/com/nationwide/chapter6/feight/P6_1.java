package com.nationwide.chapter6.feight;

/**
 * Write a program that initializes an array with ten random integers and then
 * prints four lines of output, containing:
 * 
 * 1) Every element at an even index. 2) Every even element. 3) All elements in
 * reverse order. 4) Only the first and last element
 * 
 * @author Suzanne Feight
 */

public class P6_1 {

	public static void main(String[] args) {

		int[] randomNumberArray = new int[10];

		for (int i = 0; i < randomNumberArray.length; i++) {

			randomNumberArray[i] = (int) (Math.random() * 100) + 1;
		}

		// Prints every element.
		System.out.println("Every element");
		for (int i = 0; i < randomNumberArray.length; i++) {
			System.out.println("Index " + i + ": " + randomNumberArray[i]);
		}
		System.out.println();

		// Prints every element at an even index.
		System.out.println("1) Every element at an even index");
		for (int i = 0; i < randomNumberArray.length; i += 2) {
			System.out.println("Index " + i + ": " + randomNumberArray[i]);
		}
		System.out.println();

		// Prints every even element.
		System.out.println("2) Every even element");
		for (int i = 0; i < randomNumberArray.length; i++) {
			if (randomNumberArray[i] % 2 == 0) {
				System.out.println("Index " + i + ": " + randomNumberArray[i]);
			}
		}
		System.out.println();

		// Prints all elements in reverse order.
		System.out.println("3) All elements in reverse order");
		for (int i = randomNumberArray.length - 1; i >= 0; i--) {
			System.out.println("Index " + i + ": " + randomNumberArray[i]);
		}
		System.out.println();

		// Prints only the first and last element.
		System.out.println("4) Only the first and last element");
		for (int i = 0; i <= randomNumberArray.length; i += randomNumberArray.length - 1) {
			System.out.println("Index " + i + ": " + randomNumberArray[i]);
		}

	}
}
