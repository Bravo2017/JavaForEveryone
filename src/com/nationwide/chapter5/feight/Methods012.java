package com.nationwide.chapter5.feight;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Create a class with three methods one with no parameters, one with one
 * parameter, and one with two parameters.
 * 
 * Have your main method call each of these.
 * 
 * @author Suzanne Feight
 */

public class Methods012 {

	private static String name = null;
	private static double annualIncome = 0;
	private static int payPeriods = 0;
	private static double hoursPerPayPeriod = 0;

	public static void printInfo() {
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Hello, my name is: " + name + ".");
		System.out.println("My annual income is: " + df.format(annualIncome));
		System.out.println("I earn " + df.format(annualIncome / payPeriods)
				+ " per pay period.");
		System.out.println("Which means I make: "
				+ df.format((annualIncome / payPeriods) / hoursPerPayPeriod)
				+ " per hour.");
	}

	public static void setAnnualIncome(double newIncome) {
		annualIncome = newIncome;

	}

	public static void setPayPeriodVariables(int numPayPeriods,
			double hoursWorked) {

		payPeriods = numPayPeriods;
		hoursPerPayPeriod = hoursWorked;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Name: ");
		name = in.next();

		System.out.println("Annual Income: ");
		setAnnualIncome(in.nextDouble());

		System.out.println("Pay periods per year: ");
		int pp = in.nextInt();

		System.out.println("Hour per pay period: ");
		double hours = in.nextDouble();

		setPayPeriodVariables(pp, hours);
		printInfo();

		in.close();
	}
}
