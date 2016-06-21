package com.nationwide.chapter8.williams;

public class Assignment8_5 {
	private double height = 0;
	private double radius = 0;
	private static final double PI = 3.14159;

	public void setHeight(double h) {
		height = h;
	}

	public void setRadius(double r) {
		radius = r;
	}

	public double getSurfaceArea() {
		return (2 * PI * height * radius) + (2 * PI * Math.pow(radius, 2));
	}

	public double getVolume() {
		return (PI * Math.pow(radius, 2) * height);
	}

}