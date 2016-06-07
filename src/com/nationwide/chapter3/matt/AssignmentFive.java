package com.nationwide.chapter3.matt;

import java.util.Scanner;

public class AssignmentFive {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many bottles do you want? ");

		if (in.hasNextInt()) {
			int bottles = in.nextInt();
			if (bottles > 10) {
				System.out.println("That is too much!");
			} else if (bottles <= 6) {
				System.out.println("Good Choice!");
			} else if (bottles > 6) {
				System.out.println("Must have been a bad day!");
			}
		}
	}

}
