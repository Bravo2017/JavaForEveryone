package com.nationwide.chapter8;

public class Greeting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String greeting = "Hello";
		String greeting2 = greeting;
		greeting2 = greeting = "Goodbye";
		System.out.println(greeting2);
	}

}
