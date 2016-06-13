package com.nationwide.chapter6.vanwyk;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Modify the LargestInArray.java program in Section 6.3 to mark both the smallest and the largest elements.
 */

public class P3 {

	public static void main(String[] args) {
		values();

	}

	public static double[] values() {

		ArrayList<Integer> values = new ArrayList<Integer>();

		values.add(new Integer(1));
		values.add(new Integer(2));
		values.add(new Integer(3));
		values.add(new Integer(4));
		values.add(new Integer(5));
		values.add(new Integer(9));

		System.out.println("this arraylist has: " + values.size()
				+ " elements in it");

		Object obj = Collections.max(values);
		System.out.println("The largest element is: " + obj);

		Object obj1 = Collections.min(values);
		System.out.println("The smallest element is: " + obj1);

		return null;

	}

}
