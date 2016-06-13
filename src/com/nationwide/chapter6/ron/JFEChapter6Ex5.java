package com.nationwide.chapter6.ron;

public class JFEChapter6Ex5 {

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
		int currentSize = values.length;
		currentSize = removeMin(values, currentSize);

		for (int i = 0; i < currentSize; i++) {
			System.out.println("value " + i + " " + values[i]);
		}
	}

	public static int removeMin(int[] values, int currentSize) {
		int smallest = values[0];
		int pos = 0;

		for (int i = 1; i < currentSize; i++) {
			if (values[i] < smallest) {
				smallest = values[i];
				pos = i;
			}
		}
		values[pos] = values[currentSize - 1];
		return --currentSize;
	}
}
