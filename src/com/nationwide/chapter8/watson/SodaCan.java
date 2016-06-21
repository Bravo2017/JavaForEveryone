package com.nationwide.chapter8.watson;

public class SodaCan {

	/*
	 * Implement a class SodaCan with methods getSurfaceArea() and getVolume().
	 * In the constructor, supply the height and radius of the can.
	 */

	private double height = 0;
	private double radius = 0;

	public double getSurfaceArea(double height, double radius) {
		return (2.0 * radius * Math.PI * height)
				+ (2.0 * Math.PI * radius * radius);
	}

	public double getVolume(double height, double radius) {
		return height * Math.PI * radius * radius;
	}

}
