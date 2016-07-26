package com.nationwide.chapter14.vipond;

import java.util.Arrays;

public class SelectionSorterTester {

	public static void main(String[] args) {
		Coins[] a = { new Coins(0.5, "Half dollar"), new Coins(0.05, "Nickel"),
				new Coins(0.10, "Dime"), new Coins(0.25, "Quarter"),
				new Coins(1.0, "Silver dollar"), new Coins(0.05, "Nickel"),
				new Coins(0.25, "Quarter"), new Coins(0.01, "Penny"),
				new Coins(0.1, "Dime") };

		System.out.println("Before sort: " + Arrays.toString(a));
		SelectionSorter s = new SelectionSorter(a);
		System.out.println("After sort:" + Arrays.toString(a));
	}
}
