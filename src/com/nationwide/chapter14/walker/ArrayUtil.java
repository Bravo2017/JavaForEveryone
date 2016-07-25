package com.nationwide.chapter14.walker;

import java.util.Random;

public class ArrayUtil {

	private static Random generator = new Random();

	static final double[] coinValues = { .01, .05, .10, .25, .50, 1.00 };

	public static double[] randomCoinArray(int length) {
		double[] coins = new double[length];

		for (int i = 0; i < coins.length; i++) {
			int randomCoin = generator.nextInt(6);
			coins[i] = coinValues[randomCoin];
		}
		return coins;
	}

	public static int[] randomIntArray(int length, int n) {
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = generator.nextInt(n);
		}
		return a;
	}

	public static void swap(double[] a, int i, int j) {
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
