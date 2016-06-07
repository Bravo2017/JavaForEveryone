package com.nationwide.chapter2;

import java.util.Scanner;

public class ScannerExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Enter the number of bottles: ");
		Scanner in = new Scanner(System.in);
		int numberOfBottles = in.nextInt();
		System.out.println(numberOfBottles);
	}

}
