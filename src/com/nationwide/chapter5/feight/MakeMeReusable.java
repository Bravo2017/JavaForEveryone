package com.nationwide.chapter5.feight;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Take the class called MakeMeReusable.java and re-work the code to add a new
 * method so it is easier to use and read
 * 
 * @author Suzanne Feight
 */

public class MakeMeReusable {

	private static double totalPurchase = 0;
	private static double rate = 0;
	private static double tax = 0;

	public static void sumPrice(double price) {
		totalPurchase = totalPurchase + price;
	}

	public static void setRate(double taxRate) {
		rate = taxRate;
	}

	public static void calculateTax() {
		tax = totalPurchase * rate / 100;
	}

	public static double calculateTotal() {
		return totalPurchase + tax;
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner in = new Scanner(System.in);
		double price = 0;

		System.out.println("Enter item prices, enter -1 to finish.");
		int count = 0;
		while (price != -1) {

			if (count == 0) {
				System.out.print("First item: ");
			} else {
				System.out.print("Next item: ");
			}

			price = in.nextDouble();
			if (price != -1) {
				sumPrice(price);
				count++;
			}
		}

		if (totalPurchase != 0) {
			System.out.print("Tax rate in percent: ");
			setRate(in.nextDouble());

			calculateTax();
			System.out.println("Amount due: " + df.format(calculateTotal()));
		} else {
			System.out.println("Good-bye");
		}
		in.close();
	}
}
