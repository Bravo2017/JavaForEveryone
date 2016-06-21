package com.nationwide.chapter8.walker;

import java.util.Scanner;

/* 
 * Soda Can Exercise
 */

public class Chapter8Ex5 {

	double height;
	double radius;
	double surfaceArea;
	double volume;
	static final double PI = 3.14;

	public Chapter8Ex5(double height, double radius) {
		this.radius = radius;
		this.height = height;
	}

	public double getSurfaceArea() {
		surfaceArea = (2 * PI * radius * height)
				+ (2 * PI * Math.pow(radius, 2));
		return surfaceArea;
	}

	public double getVolume() {
		volume = PI * Math.pow(radius, 2) * height;
		return volume;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is the height of the can? ");
		double userHeight = in.nextDouble();
		System.out.print("What is the radius of the can? ");
		double userRadius = in.nextDouble();
		Chapter8Ex5 can = new Chapter8Ex5(userHeight, userRadius);
		System.out.println("The surface area of the can is: "
				+ can.getSurfaceArea());
		System.out.println("The volume of the can is: " + can.getVolume());
		in.close();

	}

}
