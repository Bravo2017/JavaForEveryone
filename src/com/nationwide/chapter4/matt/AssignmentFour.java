package com.nationwide.chapter4.matt;

import java.util.Scanner;

public class AssignmentFour {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Bottles drank(enter 99 when done)? ");
		int bottles = in.nextInt();

		while (bottles != 99) {
			if (bottles > 10) {
				System.out.println("Better Slow Down!");
			} else if (bottles > 0 & bottles < 7) {
				System.out.println("Chug!");
			} else if (bottles > 7) {
				System.out.println("Feeling Good!");
			}
			bottles = in.nextInt();
		}
		System.out.println("Done!");
	}

}
