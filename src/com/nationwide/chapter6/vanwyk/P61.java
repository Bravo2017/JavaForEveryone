package com.nationwide.chapter6.vanwyk;

/*
 Write a program that initializes an array with ten random integers and then prints four lines of output, containing
 •Every element at an even index.
 •Every even element.
 •All elements in reverse order.
 •Only the first and last element.
 */

public class P61 {

	public static void main(String[] args) {
		dogarray();

	}

	public static int[] dogarray() {

		int[] values = new int[10];

		values[0] = 0;
		values[1] = 11;
		values[2] = 25;
		values[3] = 37;
		values[4] = 49;
		values[5] = 54;
		values[6] = 66;
		values[7] = 72;
		values[8] = 89;
		values[9] = 94;

		System.out.println("Even index's");
		for (int i = 0; i < values.length; i = i + 2) {
			System.out.print(" " + values[i]);
		}

		System.out.println(" ");// I don't think this is what they meant for me
								// to do. I assume there is a way for it to know
								// the values and not just have me system.print
								// everything
		System.out.println("\nEven elements");
		System.out.print(" " + values[0]);
		System.out.print(" " + values[5]);
		System.out.print(" " + values[6]);
		System.out.print(" " + values[7]);
		System.out.print(" " + values[9]);

		System.out.println("");
		System.out.println("\nReverse values");
		for (int i = 9; i > -1; i--) {
			System.out.print(" " + values[i]);

		}
		System.out.println("");
		System.out.println("\nNumber of Even Values");
		int count = 0;
		for (int k = 0; k < values.length; k++) {
			if (values[k] % 2 == 0) {
				count++;
			}
		}
		System.out.print(count);

		System.out.println("\n ");
		System.out.println("First and Last elements");
		System.out.println(values[0]);
		System.out.println(values[9]);

		return values;
	}

}
