package com.nationwide.chapter3.terri;

/*
 * Create a class using multiple boolean variables.
 * Use the short circuit and (&&) and or (||) as well as the not (!) operator 
 */

public class BooleanOperators {

	public BooleanOperators() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean nieces = true;
		boolean nephews = true;
		boolean sons = false;

		if (nieces && nephews) {
			System.out.println("I have nieces and nephews to help");
		}

		if (nephews || sons) {
			System.out.println("I have nephews or sons that can help");
		}

		if (!sons) {
			System.out.println("I do not have any sons to help");

		}

	}

}
