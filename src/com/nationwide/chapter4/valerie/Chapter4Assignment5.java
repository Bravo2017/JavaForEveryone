package com.nationwide.chapter4.valerie;

public class Chapter4Assignment5 {

	/**
	 * * @author DEFENBV Chapter 4 Assignment 5 Create a class using a nested
	 * loop.
	 */
	public static void main(String[] args) {

		int x;
		int y;

		for (x = 1; x <= 3; x++) {
			for (y = 1; y <= 5; y++) {
				System.out.println("x % 2 = " + x);
				System.out.println("y % 2 = " + y);
				if (x % 2 == y % 2) {
					System.out.println("equal");
					System.out.println("");
				} else {
					System.out.println("not equal");
					System.out.println("");
				}
				System.out.println();
			}
		}
	}
}