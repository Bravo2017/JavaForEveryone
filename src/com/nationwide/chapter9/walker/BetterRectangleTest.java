package com.nationwide.chapter9.walker;

import java.util.Scanner;

public class BetterRectangleTest {

	public static void main(String[] args) {
		
		int width;
		int height;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter rectangle width:  ");
		width = input.nextInt();
		
		System.out.print("Enter rectangle height: ");
		height = input.nextInt();

		BetterRectangle rectangle = new BetterRectangle();
		
		System.out.println("");
		System.out.println("Perimiter: " + rectangle.getPerimeter(width, height));
		System.out.println("Area:      " + rectangle.getArea(width, height));
		input.close();
		
	}

}
