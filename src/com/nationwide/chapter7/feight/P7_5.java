package com.nationwide.chapter7.feight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program that asks the user for a file name and prints the number of
 * characters, words, and lines in that file.
 * 
 * @author Suzanne Feight
 * 
 */

public class P7_5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {

		String inptFilePrefix = "C:\\JavaForEveryone\\src\\com\\nationwide\\jfe\\chapter7\\homework\\";
		Scanner console = new Scanner(System.in);

		System.out.print("Input file name: ");
		String inputFile = inptFilePrefix + console.next();
		Scanner in = new Scanner(new File(inputFile));
		in.useDelimiter("");

		int characterCount = 0;
		int characterSpaceCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		while (in.hasNextLine()) {
			String line = in.nextLine();
			lineCount++;
			for (int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i);
				if (Character.isWhitespace(ch) || i == line.length() - 1) {
					wordCount++;
				}

				if (!Character.isWhitespace(ch)) {
					characterCount++;
				}
				characterSpaceCount++;
			}
		}
		in.close();

		System.out.println("Characters without spaces : " + characterCount);
		System.out.println("Characters with spaces : " + characterSpaceCount);
		System.out.println("Words : " + wordCount);
		System.out.println("Lines : " + lineCount);

	}
}
