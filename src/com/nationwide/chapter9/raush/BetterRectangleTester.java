package com.nationwide.chapter9.raush;

public class BetterRectangleTester {

	public BetterRectangleTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		/*
		 * Input to BetterRectangle is location parameters (x, y), width,
		 * height)
		 */
		int x = 2;
		int y = 3;
		int width = 3;
		int height = 4;

		BetterRectangle r = new BetterRectangle(1, 2, 3, 4);
		double perimeter = r.getPerimeter();
		double area = r.getArea();

		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println("width = " + width);
		System.out.println("height = " + height);

		System.out.printf("Rectangle Perimeter is %.2f\n", perimeter);
		System.out.printf("Rectangle Area is      %.2f\n", area);
	}
}
