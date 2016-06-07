package com.nationwide.chapter3;

public class Example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Nested if
		final double RATE1 = 0.10;
		final double RATE2 = 0.25;
		final double RATE1_SINGLE_LIMIT = 32000;
		final double RATE1_MARRIED_LIMIT = 64000;

		double tax1 = 0;
		double tax2 = 0;

		String maritalStatus = "m";

		if (maritalStatus.equals("s")) {
			double income = 50000;
			if (income <= RATE1_SINGLE_LIMIT) {
				tax1 = RATE1 * income;
			} else {
				tax1 = RATE1 * RATE1_SINGLE_LIMIT;
			}
		}

		// Enum usage
		FilingStatus status = FilingStatus.SINGLE;
		if (status == FilingStatus.MARRIED) {
			System.out.println(FilingStatus.MARRIED);
		} else if (status == FilingStatus.SINGLE) {
			System.out.println(FilingStatus.SINGLE);
		} else {
			System.out.println("Married filing seperately");
		}

		// boolean variables and operators
		boolean exceededCatLimit = false;
		int numberOfCats = 3;
		String homeType = "apartment";
		if (numberOfCats >= 2) {
			exceededCatLimit = true;
		}

		if (exceededCatLimit && homeType.equals("apartment")) {
			System.out.println("Too many cats!!!");
		}

	}

	public enum FilingStatus {
		SINGLE, MARRIED, MARRIED_FILING_SEPARATELY
	};

}
