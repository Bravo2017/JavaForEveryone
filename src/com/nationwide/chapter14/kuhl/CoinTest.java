package com.nationwide.chapter14.kuhl;

import java.util.Arrays;

public class CoinTest {

	/**
	 * This program modifies the selection sort algorithm to sort an array of
	 * coins by their values. The program uses 4 arrays: array of the values and
	 * names of valid coins array of the names of unsorted coins array of the
	 * numeric values of the unsorted coins array of the names of the sorted
	 * coins THank you beth defenbaugh
	 */

	public static void main(String[] args) {

		// Coin class to create an array of the names of valid coins plus values
		Coin[] validCoins = { new Coin(0.01, "Penny"),
				new Coin(0.05, "Nickel"), new Coin(0.10, "Dime"),
				new Coin(0.25, "Quarter"), new Coin(1.00, "Dollar") };

		// Create an array of unsorted coins

		String[] unsortedCoins = { "Dollar", "Penny", "Dime", "Quarter",
				"Nickel",

		};

		// array with numeric values from unsorted

		double coinsValue[] = new double[unsortedCoins.length];

		// For each value in the unsortedCoins array, loop through the
		// validCoins array until
		// the numeric value of the coin is found.
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

		// call the sort method in the SelectionSorter class to sort the
		// coinValue array since it only contains the numeric values of the
		// coins

		Arrays.sort(coinsValue);

		// array to hold the names of the sorted coins
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
		System.out.println(Arrays.toString(sortedCoins));
	}

}
