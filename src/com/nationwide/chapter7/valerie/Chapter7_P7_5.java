package com.nationwide.chapter7.valerie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Chapter7_P7_5 {

	/**
	 * @author Valerie Defenbaugh Write a program that asks the user for a file
	 *         name and prints the number of characters, words, and lines in
	 *         that file.
	 */

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the file name: ");
		String fileName = in.next();
		in.close();

		// Construct a file object with the name hello.txt
		File inputFile = new File(
				"C:/Users/DEFENBV/Documents/Java/JavaForEveryone/" + fileName
						+ ".txt");

		// Construct a Scanner object
		Scanner inFile = new Scanner(inputFile);

		// Count the number of words
		int wordCount = 0;
		while (inFile.hasNext()) {
			String input = inFile.next();
			wordCount = wordCount + 1;
		}

		// Construct a Scanner object
		inFile = new Scanner(inputFile);

		// Count the number of characters
		int charCount = 0;
		inFile.useDelimiter("");
		while (inFile.hasNext()) {
			char ch = inFile.next().charAt(0);
			charCount = charCount + 1;
		}

		// Construct a Scanner object
		inFile = new Scanner(inputFile);

		// Count the number of lines
		int lineCount = 1;
		while (inFile.hasNextLine()) {
			String line = inFile.nextLine();
			lineCount = lineCount + 1;
		}

		inFile.close();

		System.out.println("The number of words is " + wordCount);
		System.out.println("The number of characters is " + charCount);
		System.out.println("The number of lines is " + lineCount);
	}
}
