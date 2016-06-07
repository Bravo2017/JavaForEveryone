package com.nationwide.chapter2;

public class StringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "Harry";
		int n = name.length();

		// Concatenation
		String fName = "Harry";
		String lName = "Morgan";
		String fullName = fName + " " + lName;

		// Escape sequences
		String directory = "C:\\folder\\file.txt";
		String printNewLine = "Hello\nWorld";

		String word = "farm";
		char first = word.charAt(0);
		char last = word.charAt(3);

		String greet = "Hello Wordl!";
		String beginGreet = greet.substring(0, 5);
		String endGreet = greet.substring(6);
		System.out.println(beginGreet);
		System.out.println(endGreet);

	}

}
