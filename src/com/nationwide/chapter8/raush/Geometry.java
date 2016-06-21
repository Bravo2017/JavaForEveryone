package com.nationwide.chapter8.raush;

/**
 * Write static methods •public static double sphereVolume(double r) •public
 * static double sphereSurface(double r) •public static double
 * cylinderVolume(double r, double h) •public static double
 * cylinderSurface(double r, double h) •public static double coneVolume(double
 * r, double h) •public static double coneSurface(double r, double h) that
 * compute the volume and surface area of a sphere with a radius r, a cylinder
 * with a circular base with radius r and height h, and a cone with a circular
 * base with radius r and height h. Place them into a class Geometry. Then write
 * * a program that prompts the user for the values of r and h, calls the six
 * methods, and prints the results.
 */

public class Geometry {

	public static double sphereVolume(double r) {
		// calc sphere surface then return calcualted value
		double volume = (4.0 / 3.0) * Math.PI * (r * r * r);
		return volume;

	}

	public static double sphereSurface(double r) {
		// calc sphere surface then return calcualted value
		double surface = 4.0 * Math.PI * r * r;
		return surface;

	}

	public static double cylinderVolume(double r, double h) {
		// calcualte and return in one statement
		return h * Math.PI * r * r;

	}

	public static double cylinderSurface(double r, double h) {
		// calcualate and return in one statement
		return (2.0 * r * Math.PI * h) + (2.0 * Math.PI * r * r);

	}

	public static double coneVolume(double r, double h) {
		// calcualte and return in one statement
		return (1.0 / 3.0) * Math.PI * r * r * h;

	}

	public static double coneSurface(double r, double h) {
		// calcualte and return in one statement
		return Math.PI * r * (Math.sqrt((h * h) + (r * r)));

	}
}