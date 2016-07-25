package com.nationwide.chapter14.walker;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		double[] a = ArrayUtil.randomCoinArray(10);
		System.out.println(Arrays.toString(a));

		SelectionSorter.sort(a);

		System.out.println(Arrays.toString(a));

	}

}
