package com.nationwide.chapter4.terri;

/*
 * Create a class using a sentinel value
 */
public class SentinelValue {

	public SentinelValue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int count = 10;
		while (count != -1) {
			System.out.println("Count is: " + count);
			count--;
		}
	}

}
