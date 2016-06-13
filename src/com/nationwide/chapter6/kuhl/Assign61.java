package com.nationwide.chapter6.kuhl;

public class Assign61 {
	// Make array printing 10 random #'s
	public static void main(String[] args) {
		int[] ranDom = new int[10];
		for (int i = 0; i < 10; i++) {
			int r = (int) ((Math.random() * 100) + 1);
			ranDom[i] = r;
			System.out.println(r + " " + "Array Random");
		}

		// print just the even
		for (int i = 0; i < 10; i++) {
			if (i > 0) {
				if (i % 2 == 0) {
					System.out.println(ranDom[i] + " " + "EVEN Element");
				}
			}
		}

		// print the array in reverse
		for (int i = 9; i >= 0; i--) {
			System.out.println(ranDom[i] + " " + "Reverse Array");
		}

		for (int i = 0; i < 10; i++) {
			if (ranDom[i] % 2 == 0) {
				System.out.print(ranDom[i] + " ");
			}
		}
		System.out.println("Even Numbers inside array");
	}

}
