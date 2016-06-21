package com.nationwide.chapter8.vanwyk;

import java.util.Scanner;

public class GeometryTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the radius of the object: ");
		double r = in.nextDouble();

		System.out.println("Enter the height of the object: ");
		double h = in.nextDouble();

		System.out.println("If your object is a sphere the volume is: "
				+ Geometry.sphereVolume(r));
		System.out.println("If your object is a sphere the surface area is: "
				+ Geometry.sphereSurface(r));
		System.out.println("If your object is a cylinder the volume is: "
				+ Geometry.cylinderVolume(r, h));
		System.out.println("If your object is a cylinder the surface area is: "
				+ Geometry.cylinderSurface(r, h));
		System.out.println("If your object is a cone the volume is: "
				+ Geometry.coneVolume(r, h));
		System.out.println("If your object is a cone the surface area is: "
				+ Geometry.coneSurface(r, h));
	}
}
