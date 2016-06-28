package com.nationwide.chapter9.mardis;

import java.util.Scanner;

public class BetterRectangleTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the height of the rectangle ");
		int h = in.nextInt();
		System.out.println("Enter the width of the rectangle ");
		int w = in.nextInt();

		BetterRectangle br = new BetterRectangle(w, h);

		System.out.println("The area of the rectangle is " + br.getArea());
		System.out.println("The perimeter of the rectangle is "
				+ br.getPerimeter());

		in.close();
	}

}
