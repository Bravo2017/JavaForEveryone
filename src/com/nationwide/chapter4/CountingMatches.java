package com.nationwide.chapter4;

public class CountingMatches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "sdfsd";
		int spaces = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				spaces++;
			}
		}
	}
}