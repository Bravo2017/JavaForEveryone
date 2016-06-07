package com.nationwide.chapter5.davis;

/**
 * 1.Create a class with three methods one with no parameters, one with one
 * parameter, and one with two parameters. Have your main method call each of
 * these.
 */
public class Chap5Q1CallingMethod {

	public static void methodNo() {
		System.out.println("\nThis is a method with no parameters");
	};

	public static void methodOne(int parm1) {
		System.out.println("\nThis is a method with 1 int parameters");
		System.out.println("Parameter 1 = " + parm1);

	};

	public static void methodTwo(String parm1, int parm2) {
		System.out
				.println("\nThis is a method with 2 parameters string & int ");
		System.out.println("Parameter 1 = " + parm1 + " & Parameter 2 =  "
				+ parm2);
	}

	public static void main(String[] args) {
		methodNo();
		methodOne(7);
		methodTwo("One", 2);

	}

}