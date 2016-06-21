package com.nationwide.chapter8.defenbaugh;

/**
 * @author Valerie Defenbaugh Chapter 8 P8.5 Implement a class SodaCan with
 *         methods getSurfaceArea() and getVolume(). In the constructor, supply
 *         the height and radius of the can.
 */

public class SodaCan {

	public SodaCan(double height, double radius)

	{
		getVolume(height, radius);
		getSurfaceArea(height, radius);

	}

	public double getVolume(double h, double r) {
		double volume;
		volume = Math.PI * Math.pow(r, 2) * h;
		return volume;
	}

	public double getSurfaceArea(double h, double r) {
		double surfaceArea;
		surfaceArea = 2 * Math.PI * r * h;
		return surfaceArea;
	}
}
