package com.nationwide.chapter8.tekippe;

import java.util.Scanner;

public class geometryTester {

	/**
	 * This program run tests all the geometry classes
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the height: ");
		double h = in.nextDouble();

		System.out.println("Please enter the radius: ");
		double r = in.nextDouble();

		System.out.println("The volume of the sphere is: "
				+ geometry.sphereVolume(r));
		System.out.println("The suface area of the sphere is: "
				+ geometry.sphereSurface(r));
		System.out.println("The volume of the cylinder is: "
				+ geometry.cylinderVolume(r, h));
		System.out.println("The surface area of the cylinder is: "
				+ geometry.cylinderSurface(r, h));
		System.out.println("The volume of the cone is: "
				+ geometry.coneVolume(r, h));
		System.out.println("The surface area of the cone is: "
				+ geometry.coneSurface(r, h));
	}

}