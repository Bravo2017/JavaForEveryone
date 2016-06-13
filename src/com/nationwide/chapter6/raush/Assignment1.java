package com.nationwide.chapter6.raush;

import java.util.*;

public class Assignment1 {

	/**
	 * Write a program that initializes an array with ten random integers and
	 * then prints four lines of output, containing •Every element at an even
	 * index. •Every even element. •All elements in reverse order. •Only the
	 * first and last element
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int array[] = new int[10];

		System.out.println("Array of Random Numbers are: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(50);
			System.out.print(array[i] + " ");
		}
		// Print every element at an even index
		System.out.println(" ");
		System.out.println("Elements at even index:");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.print(array[i] + " at :" + i + "    ");
			}
			// Print even elements
		}
		System.out.println(" ");
		System.out.println("Elements which are even:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		// Print All elements in reverse order.
		System.out.println(" ");
		System.out.println("Reverse printing of array changes to: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		// Print only the first and last element in the array
		System.out.println(" ");
		System.out.println("First Element is: " + array[0]
				+ " and Last ELement is: " + array[array.length - 1]);

	}
}