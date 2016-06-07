package com.nationwide.chapter5.thurston;

public class ThreeMethods {

	public static void oneMethod() {
		System.out.println("A method with no parameters");
	}

	public static int doubler(int input) {
		int output = input * 2;
		return output;

	}

	public static int multiplier(int x, int y) {
		int product = x * y;
		return product;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		oneMethod();
		System.out.println(doubler(2));
		System.out.println(multiplier(2, 3));

	}

}
