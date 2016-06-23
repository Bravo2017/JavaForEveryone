package com.nationwide.chapter9.walker;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
	
	public BetterRectangle(){
		super();
	}
	
	public int getPerimeter(int width, int height){
		return (width * 2) + (height * 2);
	}
	
	public int getArea(int width, int height){
		return (width * height);
	}

}
