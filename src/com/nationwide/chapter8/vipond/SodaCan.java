package com.nationwide.chapter8.vipond;

/*
 * Implement a class SodaCan with methods getSurfaceArea() and getVolume(). In the constructor, supply the height and radius of the can.
 */

public class SodaCan {

	public static int height;
	public static int radius;

	public SodaCan() {
		height = 7;
		radius = 3;
	}

	public static double getSurfaceArea() {
		// top and bottom = (PI*r-squared) * 2 (since there is a top and bottom)
		// side - (2*PI*radius)*height
		double radiusSquared = Math.pow(radius, 2);
		double sidearea = (2 * Math.PI * radius) * height;
		double surfaceArea = 2 * (Math.PI * radiusSquared) + sidearea;
		return surfaceArea;
	}

	public static double getVolume() {
		// volume = PI * radius-squared*height
		int radiusSquared = radius * radius;
		double volume = Math.PI * radiusSquared * height;
		return volume;
	}

	public static void main(String[] args) {
		SodaCan pop = new SodaCan();
		System.out.println("The volume of the soda can is: " + pop.getVolume()
				+ ".");
		System.out.println("The surface area of the soda is: "
				+ pop.getSurfaceArea() + ".");
	}

}
