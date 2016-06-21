package com.nationwide.chapter8.vanwyk;

/**
 * Implement a class SodaCan with methods getSurfaceArea() and getVolume(). In
 * the constructor, supply the height and radius of the can.
 */

public class SodaCan {

	// declaring variables for height and radius and setting variable PI with
	// Math.PI
	private double itemheight;
	private double itemradius;
	final double PI = Math.PI;

	/**
	 * Constructs a Soda cans height and radius.
	 */
	public SodaCan(double h, double r)// constructor
	// Passing in variables for height and radius.
	{
		itemheight = h;
		itemradius = r;
	}

	/**
	 * This method calculates volume of a can and returns this amount.
	 * 
	 * @return the volume
	 */
	public double getVolume() {
		double volume = PI * Math.pow(itemradius, 2) * itemheight;
		return volume;
	}

	/**
	 * This method calculates surface area of a can and returns this amount.
	 * 
	 * @return the surfaceArea
	 */
	public double getSurfaceArea() {
		double surfaceArea = (2 * PI * itemradius * itemradius)
				+ (2 * PI * itemradius * itemheight);
		return surfaceArea;
	}

}
