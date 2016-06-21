package com.nationwide.chapter8.vanwyk;

public class SodaCanTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SodaCan sodacan1 = new SodaCan(6, 2);
		sodacan1.getVolume();

		System.out.println("Soda Can's Volume: ");
		System.out.println(sodacan1.getVolume());
		System.out.println("Soda Can's Surface Area: ");
		System.out.println(sodacan1.getSurfaceArea());
	}

}
