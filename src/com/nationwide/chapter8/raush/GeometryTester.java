package com.nationwide.chapter8.raush;

import java.util.Scanner;

public class GeometryTester {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out
				.println("Will calculate volume and surface of a sphere, cylinder and cone based on values entered for radius and height");

		System.out.println("Enter radius: ");
		double r = in.nextDouble();

		System.out.println("Enter height: ");
		double h = in.nextDouble();

		// calculate sphere volume then print volume unformatted
		double volume = Geometry.sphereVolume(r);
		System.out.println("Sphere volume is: " + volume);

		// calculate sphere surface area and print in one statement
		System.out.println("Sphere surface area is: "
				+ Geometry.sphereSurface(r));

		System.out.println();

		System.out.printf("Cylinder volume is: %.2f\n", // print formatted
				Geometry.cylinderVolume(r, h));

		System.out.printf("Cylinder surface area is: %.2f\n", // print formatted
				Geometry.cylinderSurface(r, h));

		System.out.println();

		System.out.printf("Cone volume is: %.2f\n", // print formatted
				Geometry.coneVolume(r, h));

		System.out.printf("Cone surface area is: %.2f\n", // print formatted
				Geometry.coneSurface(r, h));

		// Close console file
		in.close();

	}
}
