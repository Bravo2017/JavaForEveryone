package com.nationwide.chapter4;

public class CheckForNumerics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String test = "-123";
		if (isNum(test)) {
			System.out.println("Is a number");
		} else {
			System.out.println("NOT a number");
		}

		if (isNumeric(test)) {
			System.out.println("Is a number");
		} else {
			System.out.println("NOT a number");
		}
	}

	public static boolean isNumeric(String s) {
		return s.matches("[-+]?\\d*\\.?\\d*");
	}

	public static boolean isNum(String strNum) {
		boolean ret = true;
		try {

			Double.parseDouble(strNum);

		} catch (NumberFormatException e) {
			ret = false;
		}
		return ret;
	}

}