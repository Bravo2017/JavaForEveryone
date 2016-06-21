package com.nationwide.chapter8.vipond;

import java.util.Scanner;

public class GeometryTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a radius: ");
		Geometry geometry = new Geometry();
		double r = in.nextDouble();
		in.nextLine();
		System.out.print("Please enter a height: ");
		double h = in.nextDouble();
		System.out.println("The Volume of the Sphere is: "
				+ Geometry.sphereVolume(r));
		System.out.println("The surface area of the sphere is: "
				+ Geometry.sphereSurface(r));
		System.out.println("The volume of the cylinder is: "
				+ Geometry.cylinderVolume(r, h));
		System.out.println("The surface area of the cylinder is:  "
				+ Geometry.cylinderSurface(r, h));
		System.out.println("The volume of the cone is:  "
				+ Geometry.coneVolume(r, h));
		System.out.println("The surface area of the cone is:  "
				+ Geometry.coneSurface(r, h));

	}

}
