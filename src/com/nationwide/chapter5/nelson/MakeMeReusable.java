package com.nationwide.chapter5.nelson;

import java.util.Scanner;

public class MakeMeReusable {

	public static void main(String[] args) {
		double price = requestPrice();
		price = price + requestPrice();

		double rate = requestRate();

		double tax = calculateTax(price, rate);

		System.out.println("Amount due: " + (price + tax));
	}

	public static double requestPrice() {
		System.out.println("Enter price: ");
		Scanner in = new Scanner(System.in);
		double price = in.nextDouble();
		return price;
	}

	public static double requestRate() {
		System.out.println("Enter rate in percent: ");
		Scanner in = new Scanner(System.in);
		double rate = in.nextDouble();
		return rate;
	}

	public static double calculateTax(double price, double rate) {
		double tax = price * rate / 100;
		return tax;
	}

}