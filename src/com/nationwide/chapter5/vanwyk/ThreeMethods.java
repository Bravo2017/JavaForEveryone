package com.nationwide.chapter5.vanwyk;

/**
 * Create a class with three methods one with no parameters, one with one
 * parameter, and one with two parameters. Have your main method call each of
 * these.
 * 
 * @author VANWYKA1
 */

public class ThreeMethods {

	public static void main(String[] args) {
		int answer1 = add(2, 5);
		System.out.println(answer1);

		int answer2 = squared(3);
		System.out.println(answer2);

		int answer3 = value();
		System.out.println(answer3);
	}

	public static int add(int a, int b) { // method with 2 parameters. int a&b

		int add = a + b;
		return add;
	}

	public static int squared(int c) { // method with 1 parameter. int c

		int squared = c * c;
		return squared;

	}

	public static int value() { // method with no parameter

		int value;
		value = 50 + 50;
		return value;

	}

}