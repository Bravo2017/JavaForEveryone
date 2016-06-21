package com.nationwide.chapter8.raush;

public class SodaCanTester {

	/**
	 * @Height, Radius
	 */
	public static void main(String[] args) {
		/* Input to SodaCan is height and radius) */
		SodaCan can1 = new SodaCan(2, 6);
		double volume = can1.getVolume();
		double surface = can1.getSurface();

		System.out.printf("Volume of the can is %.2f\n", volume);
		System.out.printf("Surface area of the can is %.2f\n", surface);

	}

}
