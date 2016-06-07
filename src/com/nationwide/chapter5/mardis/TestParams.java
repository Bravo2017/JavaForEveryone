package com.nationwide.chapter5.mardis;

public class TestParams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		displayStaticText();

		String title = "Hello";
		displayText(title);

		String firstName = "Gordie";
		String lastName = "Howe";
		displayName(firstName, lastName);

	}

	public static void displayStaticText() {
		System.out.println("This method does not receive parameters");
	}

	public static void displayText(String s) {
		System.out.println("The string passed in is - " + s);
	}

	public static void displayName(String f, String l) {
		System.out.println("Name is " + l + ", " + f);

	}

}