package com.nationwide.chapter14.feight;

/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil {
	
	private static final double PENNY = .01;
	private static final double NICKEL = .05;
	private static final double DIME = .10;
	private static final double QUARTER = .25;
	private static final double HALF_DOLLAR = .50;
	private static final double DOLLAR = 1.00;
	private static double[] coins;
	
	public static double[] getUnsortedCoinArray() {

		coins = new double[6];
		
		coins[0] = HALF_DOLLAR;
		coins[1] = NICKEL;
		coins[2] = QUARTER;
		coins[3] = DOLLAR;
		coins[4] = PENNY;
		coins[5] = DIME;
		
		return coins;

	}

	public static void swap(double[] a, int i, int j) {
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}