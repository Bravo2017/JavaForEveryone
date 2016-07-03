package com.nationwide;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
	public BetterRectangle() {
		super.setLocation(height, width);
		super.setSize(height, width);
	}

	public double getPerimeter(double w, double h) {
		return (2 * (w + h));
	}

	public double getArea(double w, double h) {
		return (w * h);
	}
}
