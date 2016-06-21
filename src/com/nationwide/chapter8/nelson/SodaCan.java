package com.nationwide.chapter8.nelson;

public class SodaCan {

	/*
	 * Java for Everyone - Chapter 8 - Assignment 8.5 Implement a class SodaCan
	 * with methods getSurfaceArea() and getVolume(). In the constructor, supply
	 * the height and radius of the can.
	 */

	private double height;
	private double radius;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SodaCan can = new SodaCan(4.2, 5.1);

		double surfaceArea = can.getSurfaceArea();
		System.out.println("Surface: " + surfaceArea);

		double volume = can.getVolume();
		System.out.println("Volume:  " + volume);
	}

	public SodaCan(double height, double radius) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.radius = radius;
	}

	/**
	 * Calculate surface area of a can --> Surface Area = 2(pi r 2) + (2 pi r) *
	 * h
	 * 
	 * @return surface area
	 */
	public double getSurfaceArea() {
		double surfaceArea = (2 * (Math.PI * radius * radius))
				+ (2 * Math.PI * radius) * height;
		return surfaceArea;
	}

	/**
	 * Calculate volume of a can --> Volume = (pi r 2) * h
	 * 
	 * @return volume
	 */
	public double getVolume() {
		double volume = (Math.PI * radius * radius) * height;
		return volume;

	}
}