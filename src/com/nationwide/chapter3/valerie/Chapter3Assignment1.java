package com.nationwide.chapter3.valerie;

/**
 * @author DEFENBV Chapter 3 - Assignment 1 Create a class with multiple if
 *         alternatives using greater than, less than, equal, and not equal to.
 */

public class Chapter3Assignment1 {

	public static void main(String[] args) {

		int x = 10;
		int y = 10;
		int z = 100;

		if (x > y) {
			System.out.println("X is greater than Y");
		} else if (x < y) {
			System.out.println("X is not greater than Y");
			System.out.println("X is less than Y");
		} else if (x == y) {
			System.out.println("X is not greater than Y");
			System.out.println("X is not less than Y");
			System.out.println("X is equal to Y");
			// We would never hit this if statement
		} else if (x != y) {
			System.out.println("X is not greater than Y");
			System.out.println("X is not less than Y");
			System.out.println("X is not equal to Y");
		}
	}

}
