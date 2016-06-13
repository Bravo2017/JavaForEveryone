package com.nationwide.chapter6.nelson;

public class Assignment61 {

	/*
	 * Write a program that initializes an array with ten random integers and
	 * then prints four lines of output, containing: every element in an even
	 * index every even element all elements in reverse order only the first and
	 * last element
	 */
	public Assignment61() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double values[] = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };

		// print every element in an even index
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println("even index " + i + " value " + values[i]);
		}

		System.out.println(" ");

		// print every even element
		for (int i = 0; i < 10; i++) {
			double x = values[i] % 2;
			if (x == 0) {
				System.out.println("even value for index " + i + " value "
						+ values[i]);
			}
		}

		System.out.println(" ");

		// print all elements in reverse order
		for (int i = 9; i >= 0; i--) {
			System.out.println("reserve index " + i + " value " + values[i]);
		}

		System.out.println(" ");

		// print only the first and last element
		System.out.println("first value = " + values[0] + " last value = "
				+ values[values.length - 1]);

	}

}
