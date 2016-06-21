package com.nationwide.chapter8.feight;

/**
 * Implement a class SodaCan with methods getSurfaceArea() and getVolume(). In
 * the constructor, supply the height and radius of the can
 * 
 * @author Suzanne Feight
 * 
 */

public class P8_5_SodaCan {

	private double height;
	private double radius;

	public P8_5_SodaCan(double newHeight, double newRadius) {

		this.height = newHeight;
		this.radius = newRadius;
	}

	public double getSurfaceArea() {
		double endSurface = 2 * (3.14 * (radius * radius));
		double sideSurface = (radius * 2 * 3.14) * height;

		return endSurface + sideSurface;
	}

	public double getVolume() {

		return (3.14 * (radius * radius)) * height;
	}
}
