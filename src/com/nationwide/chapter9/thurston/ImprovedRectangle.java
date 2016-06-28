package com.nationwide.chapter9.thurston;

import java.awt.Rectangle;

public class ImprovedRectangle extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ImprovedRectangle() {
		super();
		setLocation(x, y);
		setSize(height, width);
	}

	/*
	 * public ImprovedRectangle(setLocation(x, y), setSize(height, width)) {
	 * 
	 * }
	 */

	public double getArea() {
		double area = (this.height * this.width);
		return area;
	}

	public double findPerimeter() {
		double perimeter = (this.height + this.width * 2);
		return perimeter;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
