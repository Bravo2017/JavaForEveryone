package com.nationwide.chapter2.mardis;

public class TestVariables {

	/**
	 * This class is for chapter 2 variables
	 */

	public static void main(String[] args) {
		int homeValue = 50000;
		double totalHomeValue = 0;
		byte numberOfHomes = 1;
		String address = "1234 Main St";
		double newHomeValue = 0;
		char rating = 'U';

		/*
		 * These are constants
		 */
		final double INFLATION = .03; // Rate of inflation
		final int MAXNUMBEROFHOMES = 5; // Maximum number of homes to own

		newHomeValue = homeValue * (INFLATION + 1);
		totalHomeValue = totalHomeValue + newHomeValue;
		System.out.printf("Number of homes is" + "%2d", numberOfHomes);
		System.out.printf(", New home value for " + address.substring(0, 6)
				+ " is " + "%.2f", newHomeValue);
		System.out.printf(", Average value is " + "%.4f",
				(totalHomeValue / numberOfHomes));
		System.out.println(", Total home values are " + totalHomeValue);

		// added a home. Use of increment and formating. +,-,*,/
		++numberOfHomes;
		address = "110 Center St";
		homeValue = 100000;
		newHomeValue = homeValue * (INFLATION + 1);
		totalHomeValue = totalHomeValue + newHomeValue;
		int numofHomesLeft = MAXNUMBEROFHOMES - numberOfHomes;
		System.out.println("Added a home");
		System.out.printf("Number of homes are " + "%5d", numberOfHomes);
		System.out.printf(", Only " + numofHomesLeft + " left to add");
		System.out.printf(", New home value for " + address + " is " + "%.3f",
				newHomeValue);
		System.out.printf(", Average value is " + "%.2f",
				(totalHomeValue / numberOfHomes));
		System.out.println(", Total home values are " + totalHomeValue);

		// sold a home. Use of decrement
		--numberOfHomes;
		System.out.println("Sold a home");
		System.out.println("Number of homes is " + numberOfHomes);

	}

}