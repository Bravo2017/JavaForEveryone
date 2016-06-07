package com.nationwide.chapter5;

import java.util.Scanner;

public class MakeMeReusable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("First item: ");
		double price = in.nextDouble();
		System.out.print("Next item: ");
		price = price + in.nextDouble();
		System.out.print("Tax rate in percent: ");
		double rate = in.nextDouble();
		double tax = price * rate / 100;
		System.out.println("Amount due: " + (price + tax));
	}

}
