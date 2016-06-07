package com.nationwide.chapter5.vanwyk;

/**Take the class called MakeMeReusable.java and re-work the code
 * to add a new method so it is easier to use and read
 * @author VANWYKA1
 */
import java.util.Scanner;

public class MakeMeReusable {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		totalWithTax();

	}

	public static void totalWithTax() {

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
