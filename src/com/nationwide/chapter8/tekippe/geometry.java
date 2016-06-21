package com.nationwide.chapter8.tekippe;

public class geometry {

	/**
	 * This class can return the volume or surface area of a Cylinder, Sphere or
	 * Cone given the radius and height
	 */

	public static double sphereVolume(double r) {
		return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
	}

	public static double sphereSurface(double r) {
		return 4.0 * Math.PI * Math.pow(r, 2);
	}

	public static double cylinderVolume(double r, double h) {
		return h * Math.PI * Math.pow(r, 2);
	}

	public static double cylinderSurface(double r, double h) {
		return (2.0 * r * Math.PI * h) + (2.0 * Math.PI * Math.pow(r, 2));
	}

	public static double coneVolume(double r, double h) {
		return (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
	}

	public static double coneSurface(double r, double h) {
		return Math.PI * r * (h + r);
	}

}
