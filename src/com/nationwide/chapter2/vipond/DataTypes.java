package com.nationwide.chapter2.vipond;

public class DataTypes {

	/*
	 * Create a class creating 5 different types of variables make sure they all
	 * are assigned a value. Also in this program use all three types of
	 * comments and create two constants.
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Different variable types
		int int1 = 765;
		float float1 = 71.499f;
		double double1 = 22.43;
		byte byte1 = 37;
		boolean boolean1 = true;
		char char1 = 't';

		// Constants
		final int months = 12;
		final int hoursinday = 24;
		System.out.println(int1);
		System.out.println(float1);
		System.out.println(double1);
		System.out.println(byte1);
		System.out.println(boolean1);
		System.out.println(char1);
		System.out.println(months);
		System.out.println(hoursinday);
		printfinal();

	}

	/**
	 * setting up a method to print when I am finished
	 */

	public static void printfinal() {
		System.out.print("DONE");
	}

}