package com.nationwide.chapter5.lee;

public class MethodWithNoReturn {

	static void displayPassword(String password) {
		// Write the password to the console.
		System.out.println("Password: " + password);
		// Return if our password is long enough.
		if (password.length() >= 5) {
			return;
		}
		System.out.println("Password too short!");
		// An implicit return is here.
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayPassword("Shazbut");
		displayPassword("Toad");

	}

}