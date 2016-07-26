package com.nationwide.chapter14.defenbaugh;

import java.util.Arrays;

public class Chapter14_P14_2 {

	/**
	 * author: Valerie Defenbaugh This program modifies the selection sort
	 * algorithm to sort an array of coins by their values. The program uses 4
	 * arrays: An array of the values and names of valid coins An array of the
	 * names of unsorted coins An array of the numeric values of the unsorted
	 * coins An array of the names of the sorted coins
	 */

	public static void main(String[] args) {

		// Use the Coin class to create an array of the names of valid coins and
		// their values
		Coin[] validCoins = { new Coin(0.01, "Penny"),
				new Coin(0.05, "Nickel"), new Coin(0.10, "Dime"),
				new Coin(0.25, "Quarter"), new Coin(0.50, "Half Dollar"),
				new Coin(1.00, "Dollar") };

		// Create an array of unsorted coins
		// This is an array of coins

		String[] unsortedCoins = { "Half Dollar", "Dollar", "Penny", "Dime",
				"Quarter", "Quarter", "Nickel", "Penny" };

		// Create an array of doubles using the length of the unsortedCoins
		// array
		// This will be a simple array containing just the numeric values of the
		// coins from
		// the unsortedCoins array

		double coinsValue[] = new double[unsortedCoins.length];

		// Loop through the unsortedCoins array
		/*
		 * For each value in the unsortedCoins array, loop through the
		 * validCoins array until the numeric value of the coin is found.
		 */
		// Add the numeric value of the coin to the coinsValue array
		//

		for (int i = 0; i < unsortedCoins.length; i++) {
			for (int j = 0; j <= validCoins.length; j++) {
				if (unsortedCoins[i] == validCoins[j].getName()) {
					coinsValue[i] = validCoins[j].getValue();
					break;
				}
			}
		}

		// Now we can call the sort method in the SelectionSorter class to sort
		// the
		// coinValue array since it only contains the numeric values of the
		// coins

		Arrays.sort(coinsValue);

		// Create a new array to hold the names of the sorted coins
		String[] sortedCoins = new String[unsortedCoins.length];

		// Loop through the coinsValue array (the sorted array of coin values)
		// For each element in the coinsValue array, get the name of the coins
		// from the
		// validCoins array

		for (int i = 0; i < coinsValue.length; i++) {
			for (int j = 0; j < validCoins.length; j++) {
				if (coinsValue[i] == validCoins[j].getValue()) {
					sortedCoins[i] = validCoins[j].getName();
				}
			}

		}

		System.out.println("The unsorted coins are: "
				+ Arrays.toString(unsortedCoins));
		System.out.println("THe sorted coins are: "
				+ Arrays.toString(sortedCoins));
	}

}
