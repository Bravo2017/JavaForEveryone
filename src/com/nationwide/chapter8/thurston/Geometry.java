package com.nationwide.chapter8.thurston;

import java.util.Scanner;

public class Geometry {
	static double height;
	static double radius;

	public Geometry(double height, double radius) {
		super();
		Geometry.height = height;
		Geometry.radius = radius;
	}

	public static double cylinderSurface(double height, double radius) {
		double surfaceA = (double) (2 * Math.PI * radius * height + 2 * Math.PI
				* Math.pow(height, 2));
		return surfaceA;

	}

	public static double cylinderVolume(double height, double radius) {
		double calculatedVolume = (double) (Math.PI * Math.pow(radius, 2) * height);
		return calculatedVolume;
	}

	public static double sphereVolume(double radius) {
		double sVolume = 4 / 3 * Math.PI * Math.pow(radius, 3);
		return sVolume;
	}

	public static double sphereSurface(double radius) {
		double x = 4 * Math.PI * Math.pow(radius, 2);
		return x;
	}

	public static double coneVolume(double height, double radius) {
		double x = Math.PI * Math.pow(radius, 2) * height / 3;
		return x;
	}

	public static double coneSurface(double height, double radius) {
		double x = Math.PI
				* radius
				* (radius + Math
						.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
		return x;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userinput = new Scanner(System.in);

		System.out.println("Please enter height");
		double h = userinput.nextDouble();
		h = Math.abs(h);
		System.out.println("Please enter radius");
		double r = userinput.nextDouble();
		r = Math.abs(r);

		System.out.println();

		System.out.println("The volume of your cylinder is "
				+ Geometry.cylinderVolume(h, r));
		System.out.println("The surface area of your cylinder is "
				+ Geometry.cylinderSurface(h, r));
		System.out.println();
		System.out.println("The volume of your sphere is "
				+ Geometry.sphereVolume(r));
		System.out.println("The surface area of your sphere is "
				+ Geometry.sphereSurface(r));
		System.out.println();
		System.out.println("The volume of your cone is "
				+ Geometry.coneVolume(h, r));
		System.out.println("The surface area of your cone is "
				+ Geometry.coneSurface(h, r));

	}

}
