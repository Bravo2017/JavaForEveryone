package com.nationwide.chapter5.valerie;

/**
 * @author DEFENBV Chapter 5 Assignment 1
 */

public class Chapter5Exercise1 {

	/**
	 * Create a class with three methods one with no parameters, one with one
	 * parameter, and one with two parameters. Have your main method call each
	 * of these.
	 */
	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		String c = "parameters";

		noParameter();

		oneParameter(a);

		twoParameters(b, c);

	}

	public static void noParameter() {
		System.out.println("This is a method with no parameters.");
	}

	public static void oneParameter(int x) {
		System.out.println("This is a method with " + x + " parameter.");
	}

	public static void twoParameters(int y, String a) {
		System.out.println("This is a method with " + y + " " + a);
	}

}
