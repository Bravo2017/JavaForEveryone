package com.nationwide.chapter5.mardis;

import java.util.Scanner;

public class MakeMeReusable {

	public static void main(String[] args) {

		double price = readDouble("First item: ");
		price = price + readDouble("Next item: ");
		double rate = readDouble("Tax rate in percent: ");
		double tax = price * rate / 100;
		System.out.println("Amount due: " + (price + tax));
	}

	public static double readDouble(String x) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter " + x);
		return in.nextDouble();
	}
}