package com.nationwide.chapter6;

import java.util.Arrays;

public class ArrayCopyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] values = { 45.00, 72.50, 31.00, 44.10, 100.00, 51.25, 66.99 };
		for (double element : values) {
			System.out.println(element);
		}

		double[] prices = Arrays.copyOf(values, values.length);
		for (double element : prices) {
			System.out.println(element);
		}
	}
}