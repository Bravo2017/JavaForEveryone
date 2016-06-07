package com.nationwide.chapter4.terri;

/*
 * Create a class with a nested loop
 */

public class NestedLoop {

	public NestedLoop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int policiesBA = 125670;
		int policiesBO = 198955;

		// print headings
		System.out.print("LOB  ");
		for (int year = 2016; year <= 2018; year++) {
			System.out.print("Year " + year + "    ");
		}

		// print detail lines using nested loop
		for (int lob = 1; lob <= 2; lob++) {
			if (lob == 1) {
				System.out.println("  ");
				System.out.print("BA:    ");
			} else {
				System.out.println("  ");
				System.out.print("BO:    ");
			}

			for (int year = 2016; year <= 2018; year++) {
				if (lob == 1) {
					policiesBA = policiesBA + 153308;
					System.out.print(policiesBA + "       ");
				} else {
					policiesBO = policiesBO + 193459;
					System.out.print(policiesBO + "       ");
				}
			}

		}
	}

}
