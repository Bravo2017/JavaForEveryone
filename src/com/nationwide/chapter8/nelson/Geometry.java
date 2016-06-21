package com.nationwide.chapter8.nelson;

import java.util.Scanner;

/*
 * Geometry class - Computes volume and surface area for
 * for spheres and cylinders and cones with a circular base
 * based on user input of radius and height variables and
 * prints the calculated volumes and surface areas
 */
public class Geometry {

	public Geometry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// prompt user for radius and height of 3 geometric shapes
		Scanner console = new Scanner(System.in);
		System.out.println("Enter sphere radius: ");
		double sphereRadius = console.nextDouble();

		System.out.println("Enter cylinder radius: ");
		double cylinderRadius = console.nextDouble();
		System.out.println("Enter cylinder height: ");
		double cylinderHeight = console.nextDouble();

		System.out.println("Enter cone radius: ");
		double coneRadius = console.nextDouble();
		System.out.println("Enter cone height: ");
		double coneHeight = console.nextDouble();
		System.out.println(" ");

		// Close the console file
		console.close();

		// call six geometric methods to calculate volume and surface
		double sphereVolume = Geometry.sphereVolume(sphereRadius);
		double sphereSurface = Geometry.sphereSurface(sphereRadius);
		double cylinderVolume = Geometry.cylinderVolume(cylinderRadius,
				cylinderHeight);
		double cylinderSurface = Geometry.cylinderSurface(cylinderRadius,
				cylinderHeight);
		double coneVolume = Geometry.coneVolume(coneRadius, coneHeight);
		double coneSurface = Geometry.coneSurface(coneRadius, coneHeight);

		// print results of six geometric methods
		System.out.println("Sphere volume:    " + sphereVolume);
		System.out.println("Sphere surface:   " + sphereSurface);
		System.out.println("Cylinder volume:  " + cylinderVolume);
		System.out.println("Cylinder surface: " + cylinderSurface);
		System.out.println("Cone volume:      " + coneVolume);
		System.out.println("Cone surface:     " + coneSurface);
	}

	/**
	 * Calculate sphere volume = 4/3 * pi * r3
	 * 
	 * @param r
	 *            = sphere radius
	 * @return volume = sphere volume calculated
	 */
	public static double sphereVolume(double r) {
		double volume = (4 / 3) * Math.PI * (r * r * r);
		return volume;
	}

	/**
	 * Calculate sphere surface area = 4 * pi * r2
	 * 
	 * @param r
	 *            = sphere radius
	 * @return volume = sphere surface area calculated
	 */
	public static double sphereSurface(double r) {
		double surface = 4 * Math.PI * r * r;
		return surface;
	}

	/**
	 * Calculate cylinder volume = (pi * r * r) * h
	 * 
	 * @param r
	 *            = cylinder radius
	 * @param h
	 *            = cylinder height
	 * @return volume = cylinder volume calculated
	 */
	public static double cylinderVolume(double r, double h) {
		double volume = (Math.PI * r * r) * h;
		return volume;
	}

	/**
	 * Calculate cylinder surface area = 2(pi r 2) + (2 pi r * h)
	 * 
	 * @param r
	 *            = cylinder radius
	 * @param h
	 *            = cylinder height
	 * @return surface = cylinder surface area calculated
	 */
	public static double cylinderSurface(double r, double h) {
		double surface = (2 * (Math.PI * r * r)) + (2 * Math.PI * r * h);
		return surface;
	}

	/**
	 * Calculate cone volume = pi * r2 * h/3
	 * 
	 * @param r
	 *            = cone radius
	 * @return volume = cone volume calculated
	 */
	public static double coneVolume(double r, double h) {
		double volume = Math.PI * (r * r) * (h / 3);
		return volume;
	}

	/**
	 * Calculate cone surface area = pi * r(r + sqrt(h2 + r2)
	 * 
	 * @param r
	 *            = cone radius
	 * @return volume = cone surface area calculated
	 */
	public static double coneSurface(double r, double h) {
		double surface = Math.PI * r * (r + Math.sqrt((h * h) + (r * r)));
		return surface;
	}

}
