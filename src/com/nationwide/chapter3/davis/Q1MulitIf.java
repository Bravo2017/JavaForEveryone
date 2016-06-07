package com.nationwide.chapter3.davis;

import java.util.Scanner;

public class Q1MulitIf {
	// 1.Create a class with multiple if alternatives using greater than, less
	// than, equal, and not equal to.

	/**
	 * Programming Exercise P3.3 Write a program that reads an integer and
	 * prints how many digits the number has, by checking whether the number is
	 * >=10, >=100, and so on. Assume that all intergers are less than
	 * 10,000,000,000. If the number is negative, first multiply it with -1.
	 * 
	 */
	// Why wont this work? 9,999,999,999
	final static long GTE_11_BILLION = 9999999999L;
	// Maximum value of int is 2,147,483,647

	// but this does? 1,999,999,999
	final static long GTE_10_BILLION = 1999999999;

	// GTE: Greater Than or Equal
	final static long GTE_BILLION = 1000000000;
	final static int GTE_100_MILLION = 100000000;
	final static int GTE_10_MILLION = 10000000;
	final static int GTE_MILLION = 1000000;
	final static int GTE_100_THOUSAND = 100000;
	final static int GTE_10_THOUSAND = 10000;
	final static int GTE_THOUSAND = 1000;
	final static int GTE_100 = 100;
	final static int GTE_10 = 10;
	public static int inInt;

	public static void main(String[] args) {
		Scanner inPut = new Scanner(System.in);

		System.out.print("Enter a number between 10 billion and -10 billion: ");
		long inLong = inPut.nextLong();
		String yourNumber = String.format("%,d", inLong);
		if (inLong < 0) {
			inLong = inLong * -1;
		}

		if (inLong > GTE_10_BILLION) {
			System.out
					.println("Sorry, this number is NOT BETWEEN 10 billion and -10 billion :-( ");
			System.out.println("That means it less than 11 digits");

		} else {
			inInt = (int) inLong;

			if (inInt >= GTE_BILLION) {
				System.out.println("Number of digits is 10");
			} else if (inInt >= GTE_100_MILLION) {
				System.out.println("Number of digits is 9");
			} else if (inInt >= GTE_10_MILLION) {
				System.out.println("Number of digits is 8");
			} else if (inInt >= GTE_MILLION) {
				System.out.println("Number of digits is 7");
			} else if (inInt >= GTE_100_THOUSAND) {
				System.out.println("Number of digits is 6");
			} else if (inInt >= GTE_10_THOUSAND) {
				System.out.println("Number of digits is 5");
			} else if (inInt >= GTE_THOUSAND) {
				System.out.println("Number of digits is 4");
			} else if (inInt >= GTE_100) {
				System.out.println("Number of digits is 3");
			} else if (inInt >= GTE_10) {
				System.out.println("Number of digits is 2");
			} else {
				System.out.println("Number of digits is 1");
			}

		}
		System.out.println("Your number is " + yourNumber);
	}
}
