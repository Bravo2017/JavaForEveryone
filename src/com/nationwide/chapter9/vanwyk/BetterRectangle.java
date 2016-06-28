package com.nationwide.chapter9.vanwyk;

/* P10: The Rectangle class of the standard Java library does not supply a method to 
 * compute the area or the perimeter of a rectangle. Provide a subclass BetterRectangle 
 * of the Rectangle class that has getPerimeter and getArea methods. Do not add any instance variables. 
 * In the constructor, call the setLocation and setSize methods of the Rectangle class. 
 * Provide a program that tests the methods that you supplied.
 */

/* P11: Repeat Exercise •• P9.10, but in the BetterRectangle constructor, 
 * invoke the superclass constructor.
 */

import java.awt.Rectangle;

@SuppressWarnings("serial")
public class BetterRectangle extends Rectangle {

	public BetterRectangle(int a, int b, int width, int height) {
		super(a, b, width, height);
	}

	public double getArea() {
		return super.getHeight() * super.getWidth();
	}

	public double getPerimter() {
		return 2 * super.getHeight() + 2 * super.getWidth();
	}

	public static void main(String[] args) {

	}
}