package com.nationwide.chapter3.terri;

import java.util.Scanner;

/*
 * Create a class using three types of user input validation 
 * taken from the command line
 */
public class UserInputValidation3 {

	public UserInputValidation3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = in.next();

		System.out.println("Please enter your age: ");
		int age = in.nextInt();

		System.out.print("Please enter income: ");
		double income = in.nextDouble();

		System.out.println(name + " is " + age + " and makes " + income);

	}

}
