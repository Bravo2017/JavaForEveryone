package com.nationwide.chapter9.mardis;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 231068913393087749L;

	public BetterRectangle(int w, int h) {
		super(w, h);
	}

	public int getPerimeter() {
		return height * 2 + width * 2;

	}

	public int getArea() {
		return height * width;

	}
}
