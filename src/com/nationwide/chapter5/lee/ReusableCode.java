package com.nationwide.chapter5.lee;

import java.util.Scanner;

public class ReusableCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price = readDouble("First Item: ");
		price = price + readDouble("Next Item: ");
		double rate = readDouble("Tax Rate in percent");
		double tax = price * rate / 100;
		System.out.println("Amount due: " + (price + tax));
	}

	public static double readDouble(String prompt) {
		Scanner in = new Scanner(System.in);
		System.out.println(prompt + ": ");
		return in.nextDouble();
	}
}
