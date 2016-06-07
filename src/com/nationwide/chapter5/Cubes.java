package com.nationwide.chapter5;

public class Cubes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double result1 = cubeVolume(2);
		double result2 = cubeVolume(10);
		System.out.println("A cube with side length 2 has volume " + result1);
		System.out.println("A cube with side length 10 has volume " + result2);
	}

	/**
	 * Computes the volume of a cube.
	 * 
	 * @param sideLength
	 *            the side length of the cube
	 * @return the volume
	 */
	public static double cubeVolume(double sideLength) {
		double volume = sideLength * sideLength * sideLength;
		if (volume < 10) {
			System.out.println("too small");
			return volume;
		} else {
			return volume;
		}
	}

}
