package com.nationwide.chapter2.vipond;

import java.util.Scanner;

public class UserInput {
	private static Scanner input;

	public static void main(String[] args) {
		System.out.print("Enter your age: ");
		input = new Scanner(System.in);
		int userage = input.nextInt();
		System.out.println(userage);
	}
}
