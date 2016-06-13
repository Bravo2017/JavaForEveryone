package com.nationwide.chapter5.nelson;

/* Create a class with one method that uses a variable name twice
 *  in different scopes
 */
public class Assignment3 {

	public Assignment3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Age = calcAge(2015, 1982); // age with bigger scope
		System.out.println("Calculated age is " + Age);

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
		int age = lastBirthdayYear - birthYear; // age only for method
		return age;
	}

}
