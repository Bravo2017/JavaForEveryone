package com.nationwide.chapter5.valerie;

/**
 * @author DEFENBV
 * Chapter 5 Assignment 4
 * Take the class called MakeMeReusable.java and re-work the code to add a new method so it is easier to use and read
 */

import java.util.Scanner;

public class MakeMeReusable {

	public static void main(String[] args) {
		double price = readDouble("First item");
		price = price + readDouble("Next item");
		double rate = readDouble("Tax rate in percent");
		double tax = price * rate / 100;
		System.out.println("Amount due: " + (price + tax));
	}

	public static double readDouble(String prompt) {
		Scanner in = new Scanner(System.in);
		System.out.print(prompt + ": ");
		return in.nextDouble();
	}
}
