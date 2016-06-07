package com.nationwide.chapter3.matt;

public class AssignmentFour {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean printShortCircuit = false;
		boolean printGoodCompare = false;
		boolean printBadCompare = false;
		boolean dontPrintShortCircuit = false;
		boolean goodComparison = false;
		boolean badComparison = false;
		int a = 10;
		int b = 5;
		int c = 1;
		int d = 0;

		if (a == 11 && b == 5) {
			dontPrintShortCircuit = true;
		} else {
			printShortCircuit = true;
		}
		if (printShortCircuit) {
			System.out.println("Short Circuit!");
		}
		if (a == 11 | b == 5) {
			printGoodCompare = true;
		} else {
			printBadCompare = true;
		}
		if (printGoodCompare) {
			System.out.println("Comparison met!");
		}
		if (a == 10 && b == 4) {
			goodComparison = true;
		} else {
			badComparison = true;
		}
		if (!goodComparison) {
			System.out.println("Comparison not met!");
		}
	}

}