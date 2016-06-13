package com.nationwide.chapter6.ron;

public class JFEChapter6EX1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = new int[10];

		for (int i = 0; i < 10; i++) {
			values[i] = (int) (Math.random() * 100);
			System.out.println("value " + i + " " + values[i]);
		}
		System.out.println("Print even indexes");
		printEvenIndex(values);
		System.out.println("Print even elements");
		printEvenElements(values);
		System.out.println("Print elements reverse order");
		printElementsReverse(values);
		System.out.println("Print first and last elements");
		printFirstLastElements(values);
	}

	public static void printEvenIndex(int[] values) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				System.out.println("value " + i + " " + values[i]);
		}
	}

	public static void printEvenElements(int[] values) {
		for (int i = 0; i < 10; i++) {
			if (values[i] % 2 == 0)
				System.out.println("value " + i + " " + values[i]);
		}
	}

	public static void printElementsReverse(int[] values) {
		for (int i = 9; i >= 0; i--) {
			System.out.println("value " + i + " " + values[i]);
		}
	}

	public static void printFirstLastElements(int[] values) {
		System.out.println("value  0 " + values[0]);
		System.out.println("value  9 " + values[9]);
	}
}
