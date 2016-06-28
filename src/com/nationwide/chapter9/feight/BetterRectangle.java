package com.nationwide.chapter9.feight;

import java.awt.Rectangle;

/**
 * Repeat Exercise •• P9.10, but in the BetterRectangle constructor, invoke the
 * superclass constructor.
 * 
 * •• P9.10 •• The Rectangle class of the standard Java library does not supply
 * a method to compute the area or the perimeter of a rectangle. Provide a
 * subclass BetterRectangle of the Rectangle class that has getPerimeter and
 * getArea methods. Do not add any instance variables. In the constructor, call
 * the setLocation and setSize methods of the Rectangle class. Provide a program
 * that tests the methods that you supplied.
 * 
 * @author Suzanne Feight
 * 
 */

public class BetterRectangle extends Rectangle {

	private static final long serialVersionUID = 752095919492553257L;

	public BetterRectangle() {
		super();
	}

	public double getPerimeter() {

		return 2 * (height + width);

	}

	public double getPerimeter(double length, double width) {

		return 2 * (length + width);

	}

	public double getArea() {

		return height * width;

	}

	public double getArea(double length, double width) {

		return length * width;

	}

}
