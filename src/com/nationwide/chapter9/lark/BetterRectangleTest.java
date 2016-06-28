package com.nationwide.chapter9.lark;

import java.util.Scanner;

public class BetterRectangleTest {

	public static void main(String[] args) {
		int height;
		int width;
		int x;
		int y;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter Rectangle Height");
		height = in.nextInt();
		System.out.print("Please enter Rectangle Width");
		width = in.nextInt();
		System.out.print("Please enter x-coordinate");
		x = in.nextInt();
		System.out.print("Please enter y-coordinate");
		y = in.nextInt();

		BetterRectangle bob = new BetterRectangle(height, width, x, y);
		double area = bob.getArea();
		double perimeter = bob.getPerimiter();

		System.out.println("the rectangle area is " + area
				+ " and the perimiter is " + perimeter);
		System.out.println("the rectangle is located at position "
				+ bob.getLocation());

	}

}
