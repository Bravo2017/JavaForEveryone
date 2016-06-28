package com.nationwide.chapter9.feight;

/**
 * 
 * @author Suzanne Feight
 * 
 */

public class BetterRectangle_Test {

	public static void main(String[] args) {

		BetterRectangle betterRectangle = new BetterRectangle();

		betterRectangle.height = 3;
		betterRectangle.width = 2;

		System.out.println("Test getPerimeter(): Expected 10.0, Actual: "
				+ betterRectangle.getPerimeter());

		System.out.println("Test getPerimeter(l, w): Expected 14.0, Actual: "
				+ betterRectangle.getPerimeter(4, 3));

		System.out.println("Test getPgetArea(): Expected 6.0, Actual: "
				+ betterRectangle.getArea());

		System.out.println("Test getPgetArea(l, w): Expected 12.0, Actual: "
				+ betterRectangle.getArea(4, 3));

	}

}
