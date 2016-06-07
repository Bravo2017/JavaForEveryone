package com.nationwide.chapter2.vipond;

/*Create a class with formatted output 
 * using float, string, and integer values. 
 * Also in this class use substring and concatenation.
 */

public class Formatted {
	public static void main(String[] args) {

		float floatvalue = 46.8723f;
		System.out.printf("formatted float value is %3.3f\n", floatvalue);

		String stringvalue = "whatever you want to say";
		System.out.printf("%s\n", stringvalue);

		int intvalue = 3904;
		System.out.printf("Number of my choice with padding %12d\n", intvalue);

		String name = "John Jacob jinglheimerschmidt";
		String fname = name.substring(0, 4);
		String mname = name.substring(5, 10);
		String lname = name.substring(11);
		String fullname = lname + ", " + fname + " " + mname;
		System.out.println(fullname);

	}
}