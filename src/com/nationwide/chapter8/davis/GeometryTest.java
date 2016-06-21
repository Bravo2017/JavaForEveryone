package com.nationwide.chapter8.davis;

import java.util.Scanner;

/**
 * @author DAVISK51
 */
/**
 * 
 P8.14 Write static methods •public static double sphereVolume(double r)
 * •public static double sphereSurface(double r) •public static double
 * cylinderVolume(double r, double h) •public static double
 * cylinderSurface(double r, double h) •public static double coneVolume(double
 * r, double h) •public static double coneSurface(double r, double h) that
 * compute the volume and surface area of a sphere with a radius r, a cylinder
 * with a circular base with radius r and height h, and a cone with a circular
 * base with radius r and height h. Place them into a class Geometry. Then write
 * a program that prompts the user for the values of r and h, calls the six
 * methods, and prints the results.
 */
public class GeometryTest {
	public static void main(String[] args) {
		// Get the radius & height
		Scanner userInput = new Scanner(System.in);

		System.out.println("Please, enter radius:");
		double radius = userInput.nextDouble();
		System.out.println("Please, enter height: ");
		double height = userInput.nextDouble();
		userInput.close();

		Geometry geometry = new Geometry(radius, height);
		Geometry.sphereVolume(radius);
		Geometry.sphereSurface(radius);
		Geometry.cylinderVolume(radius, height);
		Geometry.cylinderSurface(radius, height);
		Geometry.coneVolume(radius, height);
		Geometry.coneSurface(radius, height);

	}
}
