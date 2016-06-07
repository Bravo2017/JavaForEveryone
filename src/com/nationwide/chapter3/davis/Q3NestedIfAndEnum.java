package com.nationwide.chapter3.davis;

import java.util.Scanner;

public class Q3NestedIfAndEnum {

	/**
	 * 3.Create a class using nested if statements and Enumerated types.
	 */

	public enum Q3Employment {
		FULL_TIME, PART_TIME, OVER_TIME, UNEMPLOYED
	}

	public static void main(String[] args) {
		int q3intput;
		Scanner intPut = new Scanner(System.in);
		System.out
				.println("Please, list the number of hours workd per week:  ");
		q3intput = intPut.nextInt();

		if (q3intput == 40) {
			Q3Employment ft = Q3Employment.FULL_TIME;
			if (ft == Q3Employment.FULL_TIME) {
				System.out.println("You're a Full Time Employee");
			} else {
				System.out
						.println("How could it be anything other than ft ????");
			}

		} else if (q3intput == 0) {
			Q3Employment un = Q3Employment.UNEMPLOYED;
			if (un == Q3Employment.UNEMPLOYED) {
				System.out.println("Get a job slacker");
			} else
				System.out
						.println("How could it be anything else other than un???");
		} else if (q3intput < 40) {
			Q3Employment pt = Q3Employment.PART_TIME;
			if (pt == Q3Employment.PART_TIME) {
				System.out.println("You are a Part Time Employee");
			}

		} else if (q3intput > 40) {
			Q3Employment ct = Q3Employment.OVER_TIME;
			if (ct == Q3Employment.OVER_TIME)
				System.out.println("You're working too hard");
			if (q3intput > 60) {
				System.out.println("Really, Dude, WAY too hard");
			}
		} else {
			System.out.println("Fell through");
		}

	}
}
