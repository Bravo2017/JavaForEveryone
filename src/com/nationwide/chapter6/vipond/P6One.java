package com.nationwide.chapter6.vipond;

/*
 * Write a program that initializes an array with ten random integers and then prints four lines of output, containing
 * Every element at an even index.
 * Every even element.
 * All elements in reverse order.
 * Only the first and last element.
 */

public class P6One {

	public static void main(String[] args) {

		int[] intarray = { 1, 6, 38, 9, 27, 4, 80, 2, 11, 777 };

		for (int i = 2; i < intarray.length;) {
			System.out.println(intarray[i]);
			i = i + 2;
		}
		System.out.println();

		for (int i = 0; i < intarray.length; i++) {
			if (intarray[i] % 2 == 0) {
				System.out.print(intarray[i] + " ");
			}
		}
		System.out.println();

		for (int i = intarray.length - 1; i >= 0; i--) {
			System.out.print(intarray[i] + " ");
		}
		System.out.println();

		System.out.println(intarray[0]);
		System.out.println(intarray[intarray.length - 1]);

	}

}