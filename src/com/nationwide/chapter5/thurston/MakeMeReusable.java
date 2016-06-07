package com.nationwide.chapter5.thurston;

import java.util.Scanner;

public class MakeMeReusable {

	public static double enterItems() {
		Scanner in = new Scanner(System.in);
		double entry = 0;
		double price = 1;
		while (entry != -1) {
			System.out.print("enter item price, enter -1 to end. ");
			entry = in.nextDouble();
			price = price + entry;
		}

		double total = taxCalc(price);
		return total;

	}

	public static double taxCalc(double price) {
		double taxRate = .06;
		double amntDue = price + price * taxRate;
		return amntDue;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(enterItems());

	}

	/*
	 * (Horstmann 217) Horstmann, Cay S. Java for Everyone: Late Objects,
	 * Interactive eBook, 2nd Edition. Wiley, 02/2011. VitalBook file. The
	 * citation provided is a guideline. Please check each citation for accuracy
	 * before use.
	 */

}
