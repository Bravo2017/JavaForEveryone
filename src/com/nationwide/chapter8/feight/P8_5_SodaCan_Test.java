package com.nationwide.chapter8.feight;

/**
 * 
 * @author Suzanne Feight
 * 
 */

public class P8_5_SodaCan_Test {

	public static void main(String[] args) {

		P8_5_SodaCan sodaCan = new P8_5_SodaCan(5, 3);
		System.out
				.println("Test getSurfaceArea() : Expected: 150.72,  Actual: "
						+ sodaCan.getSurfaceArea());

		System.out.println("Test getVolume() : Expected: 141.3,  Actual: "
				+ sodaCan.getVolume());
	}

}