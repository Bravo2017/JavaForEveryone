package com.nationwide.chapter3.davis;

import java.util.Scanner;

public class Q4MultiBoolean {

	/**
	 * 4.Create a class using multiple boolean variables. Use the short circuit
	 * and (&&) and or (||) as well as the not(!) operator.
	 */
	public static void main(String[] args) {

		int q4input;
		int q4intput;
		int myNumber = 46;

		Scanner intPut = new Scanner(System.in);
		System.out.println("Pick a number between 0 through 100: ");
		q4intput = intPut.nextInt();
		if (q4intput == myNumber) {
			System.out
					.println("Wow, I don't beleive it! You win!!!!46 You got my number on the first try!");

		} else {
			Scanner inPut = new Scanner(System.in);
			System.out.println("No match yet.  Pick another number : ");
			q4input = inPut.nextInt();

			if ((q4intput < myNumber) && (q4input < myNumber)) {
				System.out.println("I WIN!! I WIN!!! I WIN!!! My number is "
						+ myNumber
						+ " and it's bigger than both of your numbers");
			} else if ((q4intput < myNumber) || (q4input < myNumber)) {
				System.out.println("It's a tie because my number is "
						+ myNumber
						+ " and it's bigger than only one of your numbers");
			} else {
				System.out
						.println("Wha Who!! Way to go! You win because my number is only "
								+ myNumber
								+ " and it's less than both of your numbers");
			}
		}
		System.out.println("Ya wanna play again?");
	}

}
