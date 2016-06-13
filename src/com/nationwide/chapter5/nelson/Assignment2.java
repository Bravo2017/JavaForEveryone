package com.nationwide.chapter5.nelson;

/*
 * Create a class with two methods:  One with no return value
 * and the other with one.
 * Add method comments to each and call them from main
 */
public class Assignment2 {

	public Assignment2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calcAnniversary(2016, 2008);

		int currentAge = calcAge(2015, 1982);
		System.out.println("Calculated age is " + currentAge);

	}

	/**
	 * Calculates the Anniversary year based on currentYear and yearStarted
	 * 
	 * @param currentYear
	 *            is the year your marriage is currently in
	 * @param yearStarted
	 *            is the year your marriage started
	 */
	public static void calcAnniversary(int currentYear, int yearStarted) {
		int years = currentYear - yearStarted;
		System.out.println("This is anniversary number " + years);
		return;
	}

	/**
	 * Calculates the Age based on last year for a birthday and birth year
	 * 
	 * @param lastBirthdayYear
	 *            is the last year for a birthday
	 * @param birthYear
	 *            is the year born
	 * @return is the calculated age
	 */
	public static int calcAge(int lastBirthdayYear, int birthYear) {
		int age = lastBirthdayYear - birthYear;
		return age;
	}
}
