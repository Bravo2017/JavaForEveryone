package com.nationwide.chapter6.williams;

import java.util.Random;

public class AssignmentOne {

	public static void main(String[] args) {
		int[] randoms = new int[10];
		Random randomGenerator = new Random();
		System.out.println("Original Array:");
		for (int i = 0; i < randoms.length; i++) {
			randoms[i] = randomGenerator.nextInt(100);
			if (i == (randoms.length - 1)) {
				System.out.println("Index=" + i + "/" + "Value=" + randoms[i]);
			} else {
				System.out.print("Index=" + i + "/" + "Value=" + randoms[i]
						+ ",");
			}
		}
		System.out.println("Even indexes:");
		for (int i = 2; i < randoms.length; i = i + 2) {
			if (i == (randoms.length - 2)) {
				System.out.println("Index=" + i + "/" + "Value=" + randoms[i]);
			} else {
				System.out.print("Index=" + i + "/" + "Value=" + randoms[i]
						+ ",");
			}
		}
		System.out.println("Even values:");
		for (int i = 0; i < randoms.length; i++) {
			if ((randoms[i] % 2) == 0) {
				System.out.print("Index=" + i + "/" + "Value=" + randoms[i]
						+ ",");
			}
		}
		System.out.println("");
		System.out.println("Reverse order:");
		for (int i = randoms.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.println("Index=" + i + "/" + "Value=" + randoms[i]);
			} else {
				System.out.print("Index=" + i + "/" + "Value=" + randoms[i]
						+ ",");
			}
		}
		System.out.println("First/Last Elements:");
		for (int i = 0; i < randoms.length; i++) {
			if (i == 0) {
				System.out.print("Index=" + i + "/" + "Value=" + randoms[i]
						+ ",");
			} else if (i == randoms.length - 1) {
				System.out.print("Index=" + i + "/" + "Value=" + randoms[i]);
			}
		}
	}

}