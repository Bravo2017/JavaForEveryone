package com.nationwide.chapter3.terri;

public class MultipleIfAlternatives {

	/*
	 * Create a class with multiple if alternatives using greater than, less
	 * than, equal, and not equal
	 */
	public MultipleIfAlternatives() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age = 8;

		if (age > 10) {
			System.out.println("You have executed the greater than");
		} else if (age < 4) {
			System.out.println("You have executed the less than");
		} else if (age == 5) {
			System.out.println("You have executed the equal");
		} else if (age != 7) {
			System.out.println("You have executed the not equal");
		} else
			System.out.println("You have falled through if");
	}

}