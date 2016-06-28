package com.nationwide.chapter9.lark;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
	private double area;
	private double perimeter;

	public BetterRectangle() {
		super();
	}

	public BetterRectangle(int height, int width, int x, int y) {
		super(height, width);
		super.setLocation(x, y);
		super.setSize(height, width);
	}

	public double getArea() {
		area = (super.getHeight() * super.getWidth());
		return area;
	}

	public double getPerimiter() {
		perimeter = (2 * super.getHeight()) + (2 * super.getWidth());
		return perimeter;
	}
}
