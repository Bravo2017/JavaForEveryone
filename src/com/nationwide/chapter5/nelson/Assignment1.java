package com.nationwide.chapter5.nelson;

/*
 * Create a class with three methods:
 *   Method One has no parameters
 *   Method Two has one parameter
 *   Method Three has two parameters
 *   Main will call all three methods
 */
public class Assignment1 {

	public Assignment1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOne();
		methodTwo("Java for Everyone");
		methodThree("Java for Everyone", "2nd");

	}

	public static void methodOne() {
		System.out.println("Method One successfully called");
		return;
	}

	public static void methodTwo(String title) {
		System.out.println("Method Two title: " + title);
		return;
	}

	public static void methodThree(String title, String edition) {
		System.out.println("Method Three title: " + title + " " + edition
				+ " Edition");
		return;
	}

}
