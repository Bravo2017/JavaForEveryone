package com.nationwide.chapter5.lee;

public class SameVariableNameInScope {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int avg = 0;
		for (int a = 10; a <= 30; a++) {
			avg = avg + a;

		}
		for (int a = 10; a <= 30; a++) {
			avg = (avg + a) / 2;
		}
		System.out.println(avg);
	}

}