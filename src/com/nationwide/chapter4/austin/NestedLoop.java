package com.nationwide.chapter4.austin;

public class NestedLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int fun = 5; fun < 10; fun++) {
			for (int yay = 7; fun == yay; yay++) {
				System.out.println("yay");
			}
			System.out.println("this is fun");
		}

	}

}
