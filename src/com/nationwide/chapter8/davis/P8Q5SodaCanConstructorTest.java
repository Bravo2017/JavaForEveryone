package com.nationwide.chapter8.davis;

import java.util.Scanner;

public class P8Q5SodaCanConstructorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Get the radius & height
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please, enter radius:");
		double r = userInput.nextDouble();
		System.out.println("Please, enter height: ");
		double h = userInput.nextDouble();
		P8Q5SodaCanConstructor pop = new P8Q5SodaCanConstructor(r, h);
		pop.getSurfaceArea();
		pop.getVolume();

	}
}
