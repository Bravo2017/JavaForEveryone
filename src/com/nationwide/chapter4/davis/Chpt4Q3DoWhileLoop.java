package com.nationwide.chapter4.davis;

import java.util.Scanner;

public class Chpt4Q3DoWhileLoop {

	/**
	 * 3.Create a class using do while loop.
	 */
	public static void main(String[] args) {
		int q3intput = 0;
		do {
			if (q3intput != 0) {
				System.out.println("Pick 11 or higher to quit");
			}
			Scanner intPut = new Scanner(System.in);
			System.out.println("Pick a number between 1 & 10:  ");
			q3intput = intPut.nextInt();

		} while (q3intput <= 10);
		System.out.println("And we're done.");
	}

}
