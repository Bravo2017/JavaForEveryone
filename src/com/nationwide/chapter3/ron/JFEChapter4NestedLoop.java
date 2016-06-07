package com.nationwide.chapter3.ron;

public class JFEChapter4NestedLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y;
		;
		while (x < 10) {
			y = 1;
			while (y < 10) {
				System.out.println("x is " + x + " y is " + y);
				y++;
			}
			x++;
		}
	}

}
