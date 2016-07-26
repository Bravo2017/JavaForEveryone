package com.nationwide.chapter14.thurston;

public class CoinArray {

	public static int[] coinIntArray(int length, int n) {
		int[] a = { 5, 5, 10, 25, 10, 100, 50, 50, 50, 1, 1, 1, 1, 1, 5, 10, 1,
				5, 1, 5, 25, 25, 25, 10, 10, 5 };

		return a;
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}