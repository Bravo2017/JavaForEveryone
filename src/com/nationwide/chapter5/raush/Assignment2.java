package com.nationwide.chapter5.raush;

public class Assignment2 {

	/**
	 * Create a class with 2 methods, one with no return value and the other
	 * with one. Add method comments to each and call them from the main
	 */
	public static void main(String[] args) {
		int divisor = 3;
		int age = 9;
		int calculatedValue = 0;

		calculatedValue = divideByNum(age, divisor);
		printValue(calculatedValue);
	}

	// Divides value supplied in parameter 1 with divisor supplied in parameter
	// 2
	// @param inputNum - the number to be divided
	// @param divisor - the number to be divided by
	public static int divideByNum(int inputNum, int divisor) {
		int result = inputNum / divisor;
		return result;
	}

	// Method with no return values
	// print parameter passed
	// @param inputNum - the value to be printed
	public static void printValue(int inputNum) {
		System.out.println(inputNum);
		return;
	}

}