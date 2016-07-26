package com.nationwide.chapter14.tekippe;

import java.util.Arrays;

/**
 * This program demonstrates the selection sort algorithm by sorting an array
 * that is filled with random numbers.
 */
public class SelectionSortDemo {
	public static void main(String[] args) {
		Coin[] a = { new Coin(0.01, "Penny"), new Coin(0.25, "Quarter"),
				new Coin(0.10, "Dime"), new Coin(0.05, "Nickel"),
				new Coin(0.10, "Dime"), new Coin(0.01, "Penny") };

		SelectionSorter s = new SelectionSorter();
		s.sort(a);

		System.out.println(Arrays.toString(a));

		System.out
				.println("Expected: [Coin[value=0.01,name =Penny], Coin[value=0.01,name=Penny],"
						+ "Coin[value=0.05,name=Nickel], Coin[value=0.1,anme=Dime], Coin[value=0.1,name=Dime],"
						+ "Coin[value=0.25,name=Quarter]]");
	}
}
