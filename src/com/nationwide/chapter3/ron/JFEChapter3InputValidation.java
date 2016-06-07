package com.nationwide.chapter3.ron;

import java.util.Scanner;

public class JFEChapter3InputValidation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a phone number: ");
		String number = in.next();
		if (number.length() != 10) {
			System.out.println("phone number must have 10 digits");
		}
	}

}
