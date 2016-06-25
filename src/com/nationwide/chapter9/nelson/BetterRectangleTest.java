package com.nationwide.chapter9.nelson;

public class BetterRectangleTest {

	public BetterRectangleTest() {
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		/* Input to BetterRectangle is x, y, width, height) */
		BetterRectangle rec = new BetterRectangle(1, 2, 3, 4);
		double perimeter = rec.getPerimeter();
		double area = rec.getArea();

		System.out.printf("Rectangle Perimeter is %.2f\n", perimeter);
		System.out.printf("Rectangle Area is      %.2f\n", area);

	}
}
