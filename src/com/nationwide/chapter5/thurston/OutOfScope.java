package com.nationwide.chapter5.thurston;

public class OutOfScope {

	public static int myMethod(int someMath) {
		for (int i = 0; i < 10; i++) {
			someMath = someMath + 1;
			// this adds 10 to the input
		}
		for (int i = 0; i < 5; i++) {
			someMath = someMath - 1;
			// this subtracts 5
		}
		return someMath;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(myMethod(2));

	}

}
