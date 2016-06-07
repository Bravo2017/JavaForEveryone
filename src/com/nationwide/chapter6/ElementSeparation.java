package com.nationwide.chapter6;

public class ElementSeparation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] values = { 45.00, 72.50, 31.00, 44.10, 100.00, 51.25, 66.99 };
		for (int i = 0; i < values.length; i++) {
			if (i > 0) {
				System.out.print(" | ");
			}
			System.out.print(values[i]);
		}
	}
}