package com.nationwide.chapter6.thurston;

import java.util.*;

public class RandomArray {

	/**
	 * 
	 * @author Nate Thurston
	 */

	// this module imported from online
	public static int randomFill() {

		Random rand = new Random();
		int randomNum = rand.nextInt();
		return randomNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// here we create the array, and populate it with random ints
		int[] randoArray = new int[10];
		for (int i = 0; i < 10; i++) {
			randoArray[i] = randomFill();
		}

		// 1st output
		for (int i = 0; i < 10; i = i + 2) {
			System.out.print(randoArray[i] + " in position " + i);
			if (i < 8) {
				System.out.print(" and ");
			}
		}
		System.out.println();

		// 2nd output
		for (int i = 0; i < 10; i++) {
			if (randoArray[i] % 2 == 0)
				System.out.print(randoArray[i] + " in position " + i + " and ");
		}
		System.out.println("done");

		// 3rd output
		for (int i = 9; i > -1; i--) {
			System.out.print(randoArray[i] + " in position " + i);
			if (i != 0) {
				System.out.print(" and ");
			}
		}
		System.out.println();

		// 4th output
		System.out.print(randoArray[0] + " and " + randoArray[9]);

	}

}