package com.nationwide.chapter5.mardis;

public class TestVariableScope {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 600;
		System.out.println("i in main is " + i + " before calling the method");
		int result = scopeTest(i);
		System.out.println("i in main after the method is still " + i);
		System.out
				.println("the result which is i from the scopeTest method is "
						+ result);
	}

	public static int scopeTest(int i) {
		i = 750;
		System.out.println("i in scopeTest is set to  " + i);
		return i;
	}

}
