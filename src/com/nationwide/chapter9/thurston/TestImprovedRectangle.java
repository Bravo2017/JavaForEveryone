package com.nationwide.chapter9.thurston;

public class TestImprovedRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImprovedRectangle test = new ImprovedRectangle();
		test.height = 5;
		test.width = 3;

		System.out.println(test.getArea() + " area");
		System.out.println(test.findPerimeter() + " perimeter");

	}

}
