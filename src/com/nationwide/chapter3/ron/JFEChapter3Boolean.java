package com.nationwide.chapter3.ron;

public class JFEChapter3Boolean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean true1 = true;
		boolean true2 = true;
		boolean false1 = false;
		boolean false2 = false;

		if (true1 || false1) {
			System.out.println("Or is true");
		}
		if (false1 || false2) {
			System.out.println("Or is false");
		}
		if (true1 && false1) {
			System.out.println("And is false");
		}
		if (true1 && true2) {
			System.out.println("And is true");
		}
		if (!false1) {
			System.out.println("this is not false");
		}

	}

}
