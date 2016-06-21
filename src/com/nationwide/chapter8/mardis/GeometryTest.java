package com.nationwide.chapter8.mardis;

import java.util.Scanner;

public class GeometryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// scanner input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius ");
		int radius = in.nextInt();
		System.out.println("Enter the height ");
		int height = in.nextInt();

		Geometry geometry = new Geometry();

		System.out.println("The radius is " + radius + " and the height is "
				+ height);
		System.out.println("The volume of a sphere is "
				+ geometry.sphereVolume(radius));
		System.out.println("The surface area of a sphere is "
				+ geometry.sphereSurface(radius));
		System.out.println("The volume of a cylinder is "
				+ geometry.cylinderVolume(radius, height));
		System.out.println("The surface area of a cylinder is "
				+ geometry.cylinderSurface(radius, height));
		System.out.println("The volume of a cone is "
				+ geometry.coneVolume(radius, height));
		System.out.println("The surface area of a cone is "
				+ geometry.coneSurface(radius, height));

		in.close();
	}

}
