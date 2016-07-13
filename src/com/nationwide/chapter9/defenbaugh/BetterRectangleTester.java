package com.nationwide.chapter9.defenbaugh;


public class BetterRectangleTester {

	/**
	 * @author: Valerie Defenbaugh Test the BetterRectangle class
	 */
	public static void main(String[] args) {

		double perimeter = 0;
		double area = 0;

		BetterRectangle r = new BetterRectangle(3, 4, 3, 4);

		perimeter = r.getPerimeter();
		area = r.getArea();

		System.out.println("The perimeter of the rectangle is " + perimeter);
		System.out.println("The area of the rectangle is " + area);

	}

}
