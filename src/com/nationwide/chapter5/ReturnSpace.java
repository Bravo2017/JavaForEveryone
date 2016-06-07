package com.nationwide.chapter5;

public class ReturnSpace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int position = firstSpace("inahurry");
		System.out.println(position);
	}

	public static int firstSpace(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				return i;
			}
		}
		return -1;
	}

}
