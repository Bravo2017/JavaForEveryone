package com.nationwide.chapter8.vipond;

/*
 * Write static methods 
 * •public static double sphereVolume(double r) 
 * •public static double sphereSurface(double r) 
 * •public static double cylinderVolume(double r, double h) 
 * •public static double cylinderSurface(double r, double h) 
 * •public static double coneVolume(double r, double h) 
 * •public static double coneSurface(double r, double h) 
 * that compute the volume and surface area of a sphere with a radius r, 
 * a cylinder with a circular base with radius r and height h, 
 * and a cone with a circular base with radius r and height h. 
 * Place them into a class Geometry. 
 * Then write a program that prompts the user for the values of r and h, 
 * calls the six methods, and prints the results. 
 */

public class Geometry {

	public static double sphereVolume(double r) {
		double sphereVol = (4.0 / 3.0) * Math.PI * (Math.pow(r, 3));
		return sphereVol;
	}

	public static double sphereSurface(double r) {
		double sphereSurArea = 4.0 * Math.PI * (Math.pow(r, 2));
		return sphereSurArea;
	}

	public static double cylinderVolume(double r, double h) {
		double cylVol = Math.PI * (Math.pow(r, 2)) * h;
		return cylVol;
	}

	public static double cylinderSurface(double r, double h) {
		double cylSurArea = 2 * (Math.PI * (Math.pow(r, 2)))
				+ (2 * Math.PI * r) * h;
		return cylSurArea;
	}

	public static double coneVolume(double r, double h) {
		double coneVol = 1.0 / 3.0 * Math.PI * (Math.pow(r, 2)) * h;
		return coneVol;
	}

	public static double coneSurface(double r, double h) {
		double coneSurArea = Math.PI * r
				* Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
		return coneSurArea;
	}

}
