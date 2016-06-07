package com.nationwide.chapter2.lee;

public class Assignment5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Formatted Output

		float retail = 21.8769f;
		System.out.printf("%10.2f\n", retail);

		int amount = 55;
		System.out.printf("Amount %6d\n", amount);

		// Concatenation

		String fName = "Donald";
		String lName = "Duck";
		String fullName = fName + " " + lName;
		System.out.println(fullName);

		// SubString

		String series = "Daddy DayCare";
		String startSeries = series.substring(0, 5);
		String stopSeries = series.substring(5);
		System.out.println(startSeries);

	}

}
