package com.nationwide.chapter3.james;

import java.util.Scanner;

public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Input from user
		System.out.print("What number am I thinking? (Between 1-50) ");
		Scanner in = new Scanner(System.in);
		int guess = in.nextInt();

		// Random number generator
		int random = (int) (Math.random() * 50 + 1);

		if (guess == random)
			System.out.println("Wow, well done.  The mayor will pay your $10!");

		if (guess != random)
			System.out.print("Sadly, you are mistaken...you were ");

		if (guess > random)
			System.out.println("just a little too high...");

		if (guess < random)
			System.out.println("just a little too low...");

		System.out.println("The answer was " + random);
	}

}