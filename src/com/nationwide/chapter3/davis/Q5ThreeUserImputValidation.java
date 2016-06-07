package com.nationwide.chapter3.davis;

import java.util.Scanner;

public class Q5ThreeUserImputValidation {

	/**
	 * 5.Create a class using three types of user input validation taken from
	 * the command line.
	 */
	public static void main(String[] args) {
		int q5intput;
		Scanner intPut = new Scanner(System.in);
		System.out.println("Pick a number between 0 through 100: ");
		if (intPut.hasNextInt()) {
			q5intput = intPut.nextInt();
			if (q5intput > 100) {
				System.out.println("I said between 0 through 100!");
			} else if (q5intput < 0) {
				System.out.println("Really, you pick a negative number?");

			} else {
				System.out.println("You're valid number = " + q5intput
						+ " Nice Job");
			}
		} else {
			System.out.println("Number must be a number, Duh");
		}

	}

}