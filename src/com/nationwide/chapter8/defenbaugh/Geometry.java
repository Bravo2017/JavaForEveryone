package com.nationwide.chapter8.defenbaugh;

/**
 * @author Valerie Defenbaugh Write static methods public static double
 *         sphereVolume(double r) public static double sphereSurface(double r)
 *         public static double cylinderVolume(double r, double h) public static
 *         double cylinderSurface(double r, double h) public static double
 *         coneVolume(double r, double h) public static double
 *         coneSurface(double r, double h) that compute the volume and surface
 *         area of a sphere with a radius r, a cylinder with a circular base
 *         with radius r and height h, and a cone with a circular base with
 *         radius r and height h. Place them into a class Geometry. Then write a
 *         program that prompts the user for the values of r and h, calls the
 *         six methods, and prints the results.
 * 
 */

public class Geometry {

	private double r;
	private double h;

	public Geometry() {
		r = 0;
		h = 0;
	}

	public static double sphereVolume(double r) {
		double sphereVolume = (4 / 3) * Math.PI * (Math.pow(r, 3));
		return sphereVolume;

	}

	public static double sphereSurface(double r) {
		double sphereSurfaceArea = 4 * Math.PI * (Math.pow(r, 2));
		return sphereSurfaceArea;
	}

	public static double cylinderVolume(double r, double h) {
		double cylinderVolume = Math.PI * (Math.pow(r, 2)) * h;
		return cylinderVolume;

	}

	public static double cylinderSurface(double r, double h) {
		double cylinderSurfaceArea = (2 * Math.PI * r) * h + 2
				* (Math.PI * (Math.pow(r, 2)));
		return cylinderSurfaceArea;
	}

	public static double coneVolume(double r, double h) {
		double coneVolume = Math.PI * (Math.pow(r, 2)) * h * 1 / 3;
		return coneVolume;

	}

	public static double coneSurface(double r, double h) {
		double coneSurfaceArea = Math.PI * r
				* Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2));
		return coneSurfaceArea;

	}

}
