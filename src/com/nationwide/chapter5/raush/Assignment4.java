package com.nationwide.chapter5.raush;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {

		double totalPrice = 0;

		totalPrice = getPrice();
		totalPrice = totalPrice + getPrice();

		double rate = getRate();

		double tax = calcTaxAmt(rate, totalPrice);

		System.out.println("Amount due: " + (totalPrice + tax));

	}

	public static double getPrice() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Price: ");
		double price = in.nextDouble();
		return price;
	}

	public static double getRate() {
		Scanner in = new Scanner(System.in);
		System.out.print("Tax rate in percent: ");
		double rate = in.nextDouble();
		return rate;
	}

	public static double calcTaxAmt(double inputRate, double inputPrice) {
		double tax = 0;
		tax = inputPrice * inputRate / 100;
		return tax;
	}

}
