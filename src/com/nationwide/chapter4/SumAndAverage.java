package com.nationwide.chapter4;

import java.util.Scanner;

public class SumAndAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double total = 0;
		Scanner in = new Scanner(System.in);
		while (in.hasNextDouble()) {
			double input = in.nextDouble();
			total = total + input;
		}
	}
}