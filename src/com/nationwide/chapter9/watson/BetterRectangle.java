package com.nationwide.chapter9.watson;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
	public BetterRectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public double getPerimeter() {
		return super.getHeight() * 2 + super.getWidth() * 2;
	}

	public double getArea() {
		return super.getHeight() * super.getWidth();
	}
}
