package com.nationwide.chapter3.davis;

import java.util.Scanner;

public class Q2SwitchStatement {

	/**
	 * 2.Create a class with a switch statement.
	 */
	public static void main(String[] args) {
		String q2input;
		char q2choice;

		Scanner inPut = new Scanner(System.in);
		System.out
				.println("Please, select the letter from the following options: ");
		System.out.println("A. If you want A");
		System.out.println("B. If you want B");
		System.out.println("C. If you want C");
		q2input = inPut.next();
		q2choice = q2input.charAt(0);

		switch (q2choice) {
		case 'A':
		case 'a':
			System.out.println("Thank you for choosing A ");
			break;
		case 'B':
		case 'b':
			System.out.println("Thank you for choosing B ");
			break;
		case 'C':
		case 'c':
			System.out.println("Thank you for choosing C ");
			break;
		default:
			System.out.println("Thank you for choosing \"" + q2input
					+ "\" but that was not an option :-(");

		}

	}
}
