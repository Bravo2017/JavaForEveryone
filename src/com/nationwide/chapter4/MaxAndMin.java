package com.nationwide.chapter4;

import java.util.Scanner;

public class MaxAndMin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double largest = in.nextDouble();
		while (in.hasNextDouble()) {
			double input = in.nextDouble();
			if (input > largest) {
				largest = input;
			}
		}
	}
}