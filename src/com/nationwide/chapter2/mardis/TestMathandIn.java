package com.nationwide.chapter2.mardis;

import java.util.Scanner;

public class TestMathandIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// modulus
		int modulusTotal = 19 % 7;
		System.out.println("--Modulus example for 19/7 has a remainder of "
				+ modulusTotal);

		// math functions
		System.out.println("---Starting Math Functions---");
		System.out.println("Square root of 9 is " + Math.sqrt(9));
		System.out.println("5 to the power of 3 is " + Math.pow(5, 3));
		System.out.println("The max of 7 and 12 is " + Math.max(7, 12));
		System.out.println("The rounded value of 7.89999992 is "
				+ Math.round(7.89999992));

		// scanner input
		Scanner in = new Scanner(System.in);
		System.out.print("Are you done? ");
		String resp = in.next();
		System.out.println(resp);
		in.close();

	}

}
