package com.nationwide.chapter4.austin;

public class DoWhileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int hunger = 10;
		System.out.println("oh im soooo hungry!\n");

		do {
			System.out.println(hunger + " I'll take a bite");
			hunger--;
		} while (hunger > 0);
		System.out.println("\nI'm finished eating");
	}

}