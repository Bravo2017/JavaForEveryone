package com.nationwide.chapter14.watson;

import java.util.Arrays;

public class CointSorterTester {

	public static void main(String[] args) {
		Coin[] a = { new Coin(0.05, "Nickel"), new Coin(1.00, "Dollar"),
				new Coin(0.25, "Quarter"), new Coin(0.01, "Penny"),
				new Coin(0.1, "Dime") };

		SelectionSorterCoin s = new SelectionSorterCoin(a);
		s.sort(a);
		System.out.println(Arrays.toString(a));
		System.out
				.println("Expected: [Coin[value=0.01,name=Penny], Coin[value=0.05,name=Nickel], Coin[value=0.1,name=Dime], Coin[value=0.25,name=Quarter], Coin[value=1.00,name=Dollar],]");
	}
}
