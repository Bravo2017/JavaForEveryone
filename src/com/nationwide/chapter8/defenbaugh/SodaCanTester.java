package com.nationwide.chapter8.defenbaugh;

import java.util.Scanner;

public class SodaCanTester {

	/**
	 * @author Valerie Defenbaugh Chapter 8 P8.5 Tester for the Soda Can class
	 */
	public static void main(String[] args) {

		System.out.print("Please enter the height of the soda can: ");

		Scanner inHeight = new Scanner(System.in);
		double height = inHeight.nextDouble();

		System.out.print("Please enter the radius of the soda can: ");

		Scanner inRadius = new Scanner(System.in);
		double radius = inRadius.nextDouble();

		SodaCan sodaCan = new SodaCan(height, radius);

		System.out.println("The soda can's volume is "
				+ sodaCan.getVolume(height, radius));
		System.out.println("The soda can's surface area is "
				+ sodaCan.getSurfaceArea(height, radius));

		inHeight.close();
		inRadius.close();

	}

}
