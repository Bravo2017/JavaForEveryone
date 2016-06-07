package com.nationwide.chapter5.davis;

/**
 * @author DAVISK51 Question 
 */
/**
 * Question 2: Create a class with two methods, one with no return value and the
 * other with one. Add method comments to each and call them from main.
 */
public class Chap5Q2ReturnValue {

	public static int total;

	public static void main(String[] args) {
		// This method has no return value
		methodOne();

		// This method returns the total of the 2 arguments sent in
		methodTwo(303, 30);
		{
			System.out.println("So the total is " + total);
		}
	}

	// This method has no return value
	public static void methodOne() {
		System.out.println("\nAbandon all hope you who enter here.  ");
		System.out.println("This is the method of no return");
	};

	// This method has 1 return value of the total of parameter 1 and 2
	public static int methodTwo(int parm1, int parm2) {
		System.out
				.println("\nThis method returns the total of parameter 1 and 2");
		System.out.println("Parm1 is " + parm1 + " and " + "Parm2 is " + parm2);
		return total = parm1 + parm2;
	}
}