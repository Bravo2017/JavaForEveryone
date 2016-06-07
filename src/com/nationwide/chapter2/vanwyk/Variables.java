package com.nationwide.chapter2.vanwyk;

public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// these are declared integers
		int a = 0;
		int b = 5;
		int c = 10;

		// these are declared doubles
		double d = 1.5;
		double e = 5.5;
		final double DIME_VALUE = .10; // Constraint on DIME_Value manes it can
										// never change when it shows final
		final double QUARTER = .25; // Constraint on QUARTER means it can never
									// change when it shows final

		// these are declared boolean, they will have true or false values
		boolean f = true;
		boolean g = false;

		// these are declared bytes, bytes are very small
		byte h = 1;
		byte i = 2;

		// these are declared longs, longs are longer numbers
		long j = 1452334;
		long k = 342352234;

		/*
		 * <-----these are delimiters they are another comment type. The
		 * compiler ignores these delimiters and everything in between. Use for
		 * more than one comment line.yes, everything in-between these ---->
		 */

		/**
		 * <---you would use this type of delimiters with an extra * if you
		 * possibly want to explain the purpose of a program
		 */

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(DIME_VALUE);
		System.out.println(QUARTER);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);

	}

}