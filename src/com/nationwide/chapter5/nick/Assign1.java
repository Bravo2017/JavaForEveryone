package com.nationwide.chapter5.nick;

public class Assign1 {

	/**
	 * Create a class with three methods one with no parameters, one with one
	 * parameter, and one with two parameters. Have your main method call each
	 * of these.
	 */
	public static void main(String[] args) {

		int x = 1;
		int y = 2;
		String z = " parameters";

		noParameter();

		oneParameter(x);

		twoParameters(y, z);

	}

	public static void noParameter() {
		System.out.println("You Have ZERO parameter.");
	}

	public static void oneParameter(int x) {
		System.out.println("You Have " + x + " parameter.");
	}

	public static void twoParameters(int y, String z) {
		System.out.println("Hey you now have:  " + y + " " + z);
	}

}
