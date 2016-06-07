package com.nationwide.chapter5;

public class NoReturnValue {
	static String sentence = "Foo was here";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sentence = printWords(sentence);
		System.out.println(sentence);
	}

	private static String printWords(String sentence1) {
		String rest = sentence;
		boolean done = false;
		while (!done) {
			int i = rest.indexOf(" ");
			if (i == -1) {
				System.out.println(rest);
				done = true;
			} else {
				System.out.println(rest.substring(0, i));
				rest = rest.substring(i + 1);
			}

		}
		return rest;
	}
}