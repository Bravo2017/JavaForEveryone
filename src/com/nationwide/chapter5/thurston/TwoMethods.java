package com.nationwide.chapter5.thurston;

public class TwoMethods {

	public static void noReturn() {
		// this method has no return
	}

	public static String returnOne(String aString) {
		return aString;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		noReturn();
		returnOne("Argument");
	}

}
