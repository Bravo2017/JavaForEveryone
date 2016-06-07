package com.nationwide.chapter5.vipond;

/*
 * 4.	Take the class called MakeMeReusable.java and 
 * re-work the code to add a new method so it is easier to use and read
 * 
 * public static void main(String[] args) {
 *	Scanner in = new Scanner(System.in);
 *	System.out.print("First item: ");
 *	double price = in.nextDouble();
 *	System.out.print("Next item: ");
 *	price = price + in.nextDouble();
 *	System.out.print("Tax rate in percent: ");
 *	double rate = in.nextDouble();
 *	double tax = price * rate / 100;
 *	System.out.println("Amount due: " + (price + tax));
 *}
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
		System.out.print(prompt + ": ");
		Scanner in = new Scanner(System.in);
		return in.nextDouble();
	}
}
