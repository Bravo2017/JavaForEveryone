package com.nationwide.chapter8.mardis;

public class Geometry {

	public static int height;
	public static int radius;

	// public static final double PI = 3.14;

	// public Geometry(int height, int radius) {
	// this.height = height;
	// this.radius = radius;
	// }

	/**
	 * Assignment 8.14 Write static methods public static double
	 * sphereVolume(double r) public static double sphereSurface(double r)
	 * public static double cylinderVolume(double r, double h) public static
	 * double cylinderSurface(double r, double h) public static double
	 * coneVolume(double r, double h) public static double coneSurface(double r,
	 * double h) that compute the volume and surface area of a sphere with a
	 * radius r, a cylinder with a circular base with radius r and height h, and
	 * a cone with a circular base with radius r and height h. Place them into a
	 * class Geometry. Then write a program that prompts the user for the values
	 * of r and h, calls the six methods, and prints the results.
	 */

	public static double sphereVolume(double r) {
		return ((4.0 / 3.0) * Math.PI * (Math.pow(r, 3)));
	}

	public static double sphereSurface(double r) {
		return (4 * Math.PI * (Math.pow(r, 2)));

	}

	public static double cylinderVolume(double r, double h) {
		return (Math.PI * Math.pow(r, 2) * h);

	}

	public static double cylinderSurface(double r, double h) {
		return ((2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2)));

	}

	public static double coneVolume(double r, double h) {
		return (Math.PI * Math.pow(r, 2) * (h / 3.0));

	}

	public static double coneSurface(double r, double h) {
		return (Math.PI * r * (r + Math.sqrt((Math.pow(r, 2) + Math.pow(h, 2)))));

	}
}
