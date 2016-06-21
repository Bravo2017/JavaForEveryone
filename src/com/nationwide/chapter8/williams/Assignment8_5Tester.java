package com.nationwide.chapter8.williams;

public class Assignment8_5Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Assignment8_5 cylinder = new Assignment8_5();
		cylinder.setHeight(12);
		cylinder.setRadius(3);
		double area = cylinder.getSurfaceArea();
		System.out.printf("Surface Area:  %.2f\n", area);
		double volume = cylinder.getVolume();
		System.out.printf("Volume:  %.2f\n", volume);
	}

}
