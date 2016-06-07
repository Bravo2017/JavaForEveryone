package com.nationwide.chapter5.vanwyk;

/**
 * Create a class with two methods, one with no return value
 *  and the other with one. Add method comments to each and call them from main.
 *  @author VANWYKA1
 */

import java.util.Scanner; //this import allows scanner method to be used below

public class TwoMethodswithComm { // this is the class name

	public static void main(String[] args) { // this is the main method, all
												// programs need one to run

		printWords(); // this is calling the printWords method prompting to run.

		double answer = yesReturn(); // this calls the yesReturn method
		System.out.println(answer); // this will print what's returned from
									// yesReturn method

	}

	public static void printWords() { // This is a method that has no return
										// value, input void designates no
										// return

		Scanner in = new Scanner(System.in); // used to allow system input
		System.out.println("Please enter a number and I will repeat it:"); // this
																			// will
																			// ask
																			// the
																			// user
		// to input a number

		int numberInput = in.nextInt(); // this will take that number input and
										// assign to int named numberInput

		System.out.println(numberInput); // this will print out that number to
											// the console
	}

	public static double yesReturn() { // This is a method that returns a value

		System.out
				.println("I will now generate a random number for no particual reason");
		double randomMath = Math.random() * 20; // this takes a random number
												// and
												// * by 20

		return randomMath; // this returns that random number back to the main
							// method
	}

}