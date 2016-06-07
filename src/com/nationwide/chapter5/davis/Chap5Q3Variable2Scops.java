package com.nationwide.chapter5.davis;

/**
 * 3. Create a class with one method that uses a variable name twice in
 * different scopes.
 */
public class Chap5Q3Variable2Scops {

	public static void main(String[] args) {
		String words;
		for (int var1 = 1; var1 <= 4; var1++) {
			words = "this is the first time we use var1 = ";
			System.out.println(words + " " + var1);
		}
		for (int var1 = 0; var1 <= 3; var1++) {
			words = "this is the second time we use var1 = ";
			System.out.println(words + " " + var1);
		}

	}

}