package com.nationwide.chapter6.ron;

public class JFEChapter6Ex3 {

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
		int largest = values[0];
		int smallest = values[0];
		for (int i = 1; i < values.length; i++) {
			if (values[i] > largest) {
				largest = values[i];
			}
			if (values[i] < smallest) {
				smallest = values[i];
			}
		}
		System.out.println("Largest " + largest);
		System.out.println("Smallest " + smallest);

	}

}
