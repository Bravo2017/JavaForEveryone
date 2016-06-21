package com.nationwide.chapter8.defenbaugh;

import java.util.Scanner;

public class GeometeryTester {

	/**
	 * @author Valerie Defenbaugh Chapter 8 P8.14 Tester for Geometry class
	 *         Write a program that prompts the user for the values of r and h,
	 *         calls the six methods, and prints the results.
	 */
	public static void main(String[] args) {

		System.out.print("Please enter the radius of the object: ");
		Scanner inRadius = new Scanner(System.in);
		double radius = inRadius.nextDouble();

		System.out.print("Please enter the height of the object: ");
		Scanner inHeight = new Scanner(System.in);
		double height = inHeight.nextDouble();

		Geometry geometry = new Geometry();

		double sphereVolume = geometry.sphereVolume(radius);
		double sphereSurfaceArea = geometry.sphereSurface(radius);

		double cylinderVolume = geometry.cylinderVolume(radius, height);
		double cylinderSurfaceArea = geometry.cylinderSurface(radius, height);

		double coneVolume = geometry.coneVolume(radius, height);
		double coneSurfaceArea = geometry.coneSurface(radius, height);

		System.out.println("The volume of the sphere with radius " + radius
				+ " is " + sphereVolume);
		System.out.println("The surface area of the sphere with radius "
				+ radius + " is " + sphereSurfaceArea);

		System.out.println("The volume of the cylinder with radius " + radius
				+ " and height " + height + " is " + cylinderVolume);
		System.out.println("The surface area of the cylinder with radius "
				+ radius + " and height " + height + " is "
				+ cylinderSurfaceArea);

		System.out.println("The volume of the cone with radius " + radius
				+ " and height " + height + " is " + coneVolume);
		System.out.println("The volume of the cone with radius " + radius
				+ " and height " + height + " is " + coneSurfaceArea);

		inRadius.close();
		inHeight.close();
	}

}
