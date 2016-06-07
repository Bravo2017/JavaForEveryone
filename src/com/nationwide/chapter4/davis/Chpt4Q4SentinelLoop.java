package com.nationwide.chapter4.davis;

import java.util.Scanner;

public class Chpt4Q4SentinelLoop {

	/**
	 * 4.Create a class using a sentinel value.
	 */
	public static void main(String[] args) {
		int counter = 1;
		int q5intput = 0;
		while (q5intput < 11) {

			Scanner intPut = new Scanner(System.in);
			if (counter > 1) {
				System.out.println("You're last number was " + q5intput);
			}
			System.out
					.println("Pick numbers between 1 & 10.  You only get 10 trys so choose wisely:  ");
			q5intput = intPut.nextInt();
			System.out.print("You have taken " + counter + " turns. ");

			counter++;
			if (counter > 10) {
				q5intput = 11;
			}

		}
		System.out.println(" And you're done");

	}

}
