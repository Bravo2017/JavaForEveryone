package com.nationwide;

public class BetterRectangleDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BetterRectangle box = new BetterRectangle();

		box.setSize(10, 20);
		box.setLocation(10, 20);

		System.out.println("Size      = " + box.getSize());
		System.out.println("Location  = " + box.getLocation());
		System.out.println("perimeter = " + box.getPerimeter(10, 20));
		System.out.println("     area = " + box.getArea(10, 20));
	}

}
