package com.nationwide.chapter7.nelson;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Assignment75 {

	/*
	 * Write a program that asks the user for a file name and prints the number
	 * of characters, words, and line in that file.
	 */
	public Assignment75() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		// Ask user for a file name
		// "C:/Users/nelsot17/Documents/string-file.txt"
		Scanner console = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String inputFileName = console.next();

		// Close the console file
		console.close();

		// Open the input file
		File inputFile = new File(inputFileName);

		// Read the input file
		Scanner in = new Scanner(inputFile);

		// Declare counts for characters, words, and lines
		int countChars = 0;
		int countWords = 0;
		int countLines = 0;

		// Read through all records in the file
		// and count number of characters, words, and lines
		while (in.hasNextLine()) {
			// Process line
			String line = in.nextLine(); // read line
			countLines = countLines + 1; // counts line
			countChars += line.trim().length(); // counts character on line
			System.out.println("  ");
			System.out.println("Line: " + line + " for line count of: "
					+ countLines + " chars: " + countChars);

			// Process Words on the line
			Scanner lineScanner = new Scanner(line);

			String word = lineScanner.next(); // read first word
			countWords = countWords + 1; // counts first word

			while (lineScanner.hasNext()) {
				word = word + " " + lineScanner.next(); // read next word
				countWords = countWords + 1; // counts next word
			}
			System.out.println("Word: " + word + " for word count of: "
					+ countWords);

			// Close lineScanner
			lineScanner.close();
		}

		// Print the number of characters, words, and lines
		System.out.println("  ");
		System.out.println("Char Count: " + countChars);
		System.out.println("Word Count: " + countWords);
		System.out.println("Line Count: " + countLines);

		// Close the input file
		in.close();
	}

}
