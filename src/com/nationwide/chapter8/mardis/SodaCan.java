package com.nationwide.chapter8.mardis;

public class SodaCan {

	/**
	 * P8.5 create a SodaCan class with getSurfaceArea and getVolume in the
	 * constructor supply the height and radius of the can
	 * 
	 */

	public static int height;
	public static int radius;
	public static final double PI = 3.14;

	public SodaCan(int height, int radius) {
		this.height = height;
		this.radius = radius;
	}

	public static double getSurfaceArea() {
		/**
		 * Surface Area = 2(pi r 2) + (2 pi r)* h
		 */
		int radiusSqd = radius * radius;
		double sa = (2 * (PI * radiusSqd)) + (2 * PI * radius * height);
		return sa;
	}

	public static double getVolume() {
		double volume = PI * (radius * radius) * height;
		return volume;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SodaCan sc = new SodaCan(4, 2);
		System.out.println("Height is " + sc.height + " and radius is "
				+ sc.radius);
		System.out.println("Surface area is " + sc.getSurfaceArea());
		System.out.println("Volume is " + sc.getVolume());
	}

}
