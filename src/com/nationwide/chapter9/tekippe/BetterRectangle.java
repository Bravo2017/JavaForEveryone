package com.nationwide.chapter9.tekippe;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

	/**
	 * @param args
	 */

	public BetterRectangle() {
		setLocation(3, 5);
		width = 2;
		height = 7;
		setSize(width, height);

	}

	public int getPerimeter() {

		return width * height;
	}

	public int getArea() {

		return 2 * width + 2 * height;
	}

}
