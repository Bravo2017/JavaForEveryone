package com.nationwide.chapter8.davis;

//P8.5 Implement a class SodaCan with methods
//getSurfaceArea() and getVolume().
//In the constructor, supply the height and radius of the can.
public class P8Q5SodaCanConstructor {
	static double radius;
	static double height;
	static double volume = 0;
	static double surfaceArea = 0;
	final static double pi = 3.14;

	public P8Q5SodaCanConstructor(double r, double h) {
		radius = r;
		height = h;
	}

	static void getSurfaceArea() {
		surfaceArea = ((radius * radius) * height);
		System.out.printf("Surface Area = " + "%.2f", surfaceArea);

	}

	static void getVolume() {
		volume = surfaceArea * pi;
		System.out.printf("\nVolume = " + "%.2f", volume);

	}

}
