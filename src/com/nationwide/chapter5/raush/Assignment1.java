package com.nationwide.chapter5.raush;

public class Assignment1 {

	/**
	 * Create a class with 3 methods. 1 with no parameters, one with one
	 * parameter and one with 2 parameters. Have the main method call each of
	 * these
	 */
	public static void main(String[] args) {
		int divisor = 3;
		int age = 9;
		int calculatedValue = 0;

		calculatedValue = multiplyByFive(age);
		System.out.println("Answer is " + calculatedValue);
		calculatedValue = divideByNum(calculatedValue, divisor);
		System.out.println("Answer is " + calculatedValue);
		calculatedValue = printAndInitializeAnswer();
		System.out.println("Answer is " + calculatedValue);
	}

	// Method with 2 parameters
	public static int divideByNum(int inputNum, int divisor) {
		int result = inputNum / divisor;
		return result;
	}

	// Method with 1 parameters
	public static int multiplyByFive(int inputNum) {
		int result = inputNum * 5;
		return result;
	}

	// Method with 0 parameters
	public static int printAndInitializeAnswer() {
		int initializedNum = 0;
		return initializedNum;
	}
}