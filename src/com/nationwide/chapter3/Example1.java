package com.nationwide.chapter3;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Basic if statement
		boolean clean = false;
		if (!clean) {
			cleanHouse();
		}

		// comparing numbers
		// and multiple alternatives
		int strokes = 45;
		if (strokes >= 36) {
			System.out.println("over par");
		} else if (strokes == 36) {
			System.out.println("par");
		} else {
			System.out.println("under par!");
		}

		// switch statement
		int digit = 4;
		String digitName;
		switch (digit) {
		case 1:
			digitName = "one";
			break;
		case 2:
			digitName = "two";
			break;
		case 3:
			digitName = "three";
			break;
		case 4:
			// digitName = "four";
			// break;
		case 5:
			// digitName = "five";
			// break;
		case 6:
			digitName = "fourFivesix";
			break;
		case 7:
			digitName = "seven";
			break;
		case 8:
			digitName = "eight";
			break;
		case 9:
			digitName = "nine";
			break;
		default:
			digitName = "";
			break;
		}
		System.out.println(digitName);
	}

	private static void cleanHouse() {
		// TODO Auto-generated method stub

	}

}
