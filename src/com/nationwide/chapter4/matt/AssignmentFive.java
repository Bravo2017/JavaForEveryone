package com.nationwide.chapter4.matt;

import java.util.Scanner;

public class AssignmentFive {

	public static void main(String[] args) {
		int bottles = 0;
		int totalBottles = 0;
		final int BOTTLES_IN_CASE = 24;
		Scanner in = new Scanner(System.in);
		System.out.println("How many cases do you want?");
		int cases = in.nextInt();

		while (cases > 0) {
			bottles = 0;
			while (bottles < BOTTLES_IN_CASE) {
				totalBottles = totalBottles + 1;
				bottles = bottles + 1;
			}
			cases = cases - 1;
		}
		System.out.println("Total Bottles:  " + totalBottles);
	}

}
