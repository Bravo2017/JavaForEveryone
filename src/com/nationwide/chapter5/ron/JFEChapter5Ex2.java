package com.nationwide.chapter5.ron;

public class JFEChapter5Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first();
		int y = second();
		System.out.println("The method returned " + y);
	}

	public static void first()
	/**
	 * This method returns nothing
	 */
	{
		System.out.println("This Method returns no value.");
	}

	public static int second()
	/**
	 * This method returns an integer
	 */
	{
		System.out.println("This Method returns an integer.");
		int x = 10;
		return x;
	}

}
