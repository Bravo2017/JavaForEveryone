package com.nationwide.chapter8.raush;

/**
 * Implement a class SodaCan with methods getSurfaceArea() and getVolume(). In
 * the constructor, supply the height and radius of the can.
 */

public class SodaCan {

	private double height;
	private double radius;

	/**
	 * Adds an item to this Soda can
	 * 
	 * @param height
	 *            the height of the can
	 * @param radius
	 *            the radius of the can
	 */
	public SodaCan(double height, double radius) {
		// constructor stub
		this.height = height;
		this.radius = radius;

	}

	/*
	 * calculate the surface area
	 * 
	 * @return surface area
	 */
	public double getSurface() {
		// Surface Area = 2(pi r 2) + (2 pi r)* h
		return (2 * (Math.PI * this.radius * this.radius))
				+ (2 * Math.PI * this.radius) * this.height;
	}

	/*
	 * Calculate the volume
	 * 
	 * @return volume
	 */
	public double getVolume() {
		// Volume - V = h * pi *r* r
		return this.height * Math.PI * this.radius * this.radius;
	}
}
