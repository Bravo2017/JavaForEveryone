package com.nationwide.chapter8.feight;

/**
 * 
 * @author Suzanne Feight
 * 
 */

public class P8_14_Geometry_Test {

	public static void main(String[] args) {

		// test coneSurface()
		System.out.println("Test coneSurface():  Expect: 170.04, Actual: "
				+ P8_14_Geometry.coneSurface(5, 3));

		// test coneVolume()
		System.out.println("Test coneVolume():  Expect: 78.5, Actual: "
				+ P8_14_Geometry.coneVolume(5, 3));

		// test cylinderSurface()
		System.out.println("Test cylinderSurface():  Expect: 251.2, Actual: "
				+ P8_14_Geometry.cylinderSurface(5, 3));

		// test cylinderVolume()
		System.out.println("Test cylinderVolume():  Expect: 235.5, Actual: "
				+ P8_14_Geometry.cylinderVolume(5, 3));

		// test sphereSurface()
		System.out.println("Test sphereSurface():  Expect: 314.0, Actual: "
				+ P8_14_Geometry.sphereSurface(5));

		// test sphereVolume()
		System.out.println("Test sphereVolume():  Expect: 392.5, Actual: "
				+ P8_14_Geometry.sphereVolume(5));

	}

}