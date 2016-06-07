package com.nationwide.chapter3.terri;

/*
 * Create a class with a switch statement
 */

public class Switch {

	public Switch() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int chapter = 3;

		switch (chapter) {
		case 1:
			System.out.println("We are in chapter 1");
			break;
		case 2:
			System.out.println("We are in chapter 2");
			break;
		case 3:
			System.out.println("We are in chapter 3");
			break;
		case 4:
			System.out.println("We are in chapter 4");
			break;
		default:
			System.out.println("We are past chapter 4");
			break;

		}

	}

}
