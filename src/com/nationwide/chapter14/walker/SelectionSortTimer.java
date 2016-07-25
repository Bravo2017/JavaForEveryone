package com.nationwide.chapter14.walker;

import java.util.Scanner;

public class SelectionSortTimer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter smallest array size(n): ");
		int minArraySize = input.nextInt();
		System.out.print("Enter largest array size(n): ");
		int maxArraySize = input.nextInt();
		System.out.print("How many measurements? ");
		int measurements = input.nextInt();
		System.out.println("");

		measurements = (maxArraySize - minArraySize) / (measurements - 1);

		for (int i = minArraySize; i <= maxArraySize; i = i + measurements) {
			int[] a = ArrayUtil.randomIntArray(i, 100);

			StopWatch timer = new StopWatch();

			timer.start();
			SelectionSorter.sort(a);
			timer.stop();

			System.out.println(i + "(n)     " + timer.getElapsedTime() + " milliseconds");
		}

		input.close();
	}

}
