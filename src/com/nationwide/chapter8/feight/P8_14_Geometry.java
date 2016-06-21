package com.nationwide.chapter8.feight;

import java.util.Scanner;

//Write static methods:
//	 
//* public static double sphereVolume(double r)
//* public static double sphereSurface(double r)
//* public static double cylinderVolume(double r, double h)
//* public static double cylinderSurface(double r, double h)
//* public static double coneVolume(double r, double h)
//* public static double coneSurface(double r, double h)
//
//that compute the volume and surface area of a sphere with a radius r, 
//a cylinder with a circular base with radius r and height h, 
//and a cone with a circular base with radius r and height h.
//Place them into a class Geometry. 
//Then write a program that prompts the user for the values of r and h, 
//calls the six methods, and prints the results
//
//@author Suzanne Feight

public class P8_14_Geometry {

	public static double sphereVolume(double r) {
		return (4 / 3) * 3.14 * (r * r * r);
	}

	public static double sphereSurface(double r) {
		return 4 * 3.14 * (r * r);
	}

	public static double cylinderVolume(double r, double h) {
		return (3.14 * (r * r)) * h;
	}

	public static double cylinderSurface(double r, double h) {
		double endSurface = 2 * (3.14 * (r * r));
		double sideSurface = (r * 2 * 3.14) * h;

		return endSurface + sideSurface;
	}

	public static double coneVolume(double r, double h) {
		return 3.14 * (r * r) * (h / 3);
	}

	public static double coneSurface(double r, double h) {
		return 3.14 * r * (r + (Math.sqrt((r * r) + (h * h))));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the radius: ");
		double radius = in.nextDouble();

		System.out.println("Please enter the height: ");
		double height = in.nextDouble();

		System.out.println("The following are your results:");
		System.out.println("SPHERE:   Volume: "
				+ P8_14_Geometry.sphereVolume(radius) + ", Surface Area: "
				+ P8_14_Geometry.sphereSurface(radius));

		System.out.println("CYLINDER: Volume: "
				+ P8_14_Geometry.cylinderSurface(radius, height)
				+ ", Surface Area: "
				+ P8_14_Geometry.cylinderSurface(radius, height));

		System.out.println("CONE:     Volume: "
				+ P8_14_Geometry.coneVolume(radius, height)
				+ ",  Surface Area: "
				+ P8_14_Geometry.coneSurface(radius, radius));

	}
}
