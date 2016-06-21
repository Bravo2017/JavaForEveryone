package com.nationwide.chapter8.thurston;

import java.util.*;

public class SodaCan {
	double height;
	double radius;

	public SodaCan(double height, double radius) {
		super();
		this.height = height;
		this.radius = radius;
		System.out.println("The surface area of your cylinder is "
				+ surfaceArea());
		System.out.println("The volume of your cylinder is " + volume());
	}

	public double surfaceArea() {
		double surfaceA = (double) (2 * Math.PI * radius * height + 2 * Math.PI
				* Math.pow(height, 2));
		return surfaceA;

	}

	public double volume() {
		double calculatedVolume = (double) (Math.PI * Math.pow(radius, 2) * height);
		return calculatedVolume;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userinput = new Scanner(System.in);

		System.out.println("Please enter cylinder height");
		double a = userinput.nextDouble();
		a = Math.abs(a);
		System.out.println("Please enter cylinder redius");
		double b = userinput.nextDouble();
		b = Math.abs(b);

		System.out.println();

		SodaCan calculate = new SodaCan(a, b);
		// System.out.println("The Volume of your cylinder is " +
		// calculate.volume());
		// System.out.println("The surface area of your cylinder is " +
		// calculate.surfaceArea());

	}

}
