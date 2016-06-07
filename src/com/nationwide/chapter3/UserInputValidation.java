package com.nationwide.chapter3;

import java.util.Scanner;

public class UserInputValidation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Phone Number: ");
		String phoneNumber = in.nextLine();
		if (phoneNumber.length() < 10) {
			System.out.println("Phone Number too short!");
		}
		System.out.print("Zip Code: ");
		String zipCode = in.nextLine();
		if (zipCode.length() < 5) {
			System.out.println("Zip code too short!");
		}

	}

}
