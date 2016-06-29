package com.nationwide.chapter9.defenbaugh;

/**
 * @author: Valerie Defenbaugh
 * P9_11
 * Provide a subclass BetterRectangle of the Rectangle class that has getPerimeter and getArea methods. 
 * In the BetterRectangle constructor, invoke the superclass constructor.
 */

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

	public BetterRectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	public double getPerimeter() {
		return 2 * super.getHeight() + 2 * super.getWidth();
	}

	public double getArea() {
		return super.getHeight() * super.getWidth();
	}

}
