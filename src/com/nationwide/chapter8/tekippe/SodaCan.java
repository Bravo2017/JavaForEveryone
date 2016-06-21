package com.nationwide.chapter8.tekippe;

public class SodaCan {

	/**
	 * @param args
	 */
	private static double height;
	private static double radius;

	public SodaCan() {
		height = 10.0;
		radius = 3.0;
	}

	public static void main(String[] args) {

		SodaCan coke = new SodaCan();

		double surfaceArea = getSurfaceArea();
		double volume = getVolume();

		System.out.println("The surface area is " + surfaceArea);
		System.out.println("The volume is " + volume);

	}

	private static double getVolume() {
		// calculates the volume of a cylinder
		double volume = Math.PI * radius * radius * height;
		return volume;
	}

	private static double getSurfaceArea() {
		// Calculates the surface area of a cylinder
		double surfaceArea = 2 * radius * Math.PI * height + 2 * Math.PI
				* radius * radius;
		return surfaceArea;

	}

}
