package com.nationwide.chapter7.davis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author DAVISK51
 */
/**
 * P7.5 Write a program that asks the user for a file name and prints the number
 * of characters, words, and lines in that file
 */
public class P7Q5FileNameAndPrint {

	private static Scanner inWord;

	public static void main(String[] args) {
		// Get the file name
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please, enter file name:");
		String fileName = userInput.nextLine();
		File p7Q5 = new File(fileName);

		// Check to see if file exists
		Scanner in = null;
		try {
			in = new Scanner(p7Q5);
		} catch (FileNotFoundException e) {
			System.out.println("\n ");
			System.out.println("File " + p7Q5
					+ " is not found.  Please, try again.");
			System.out.println("\n ");
			e.printStackTrace();

		}
		// Read File and Count
		int totalChars = 0;
		int lineCount = 0;
		int totalWords = 0;

		// Count lines
		while (in.hasNextLine()) {
			int wordCount = 0;
			String line = in.nextLine();
			lineCount++;
			inWord = new Scanner(line);
			while (inWord.hasNext()) {

				String word = inWord.next();
				wordCount++;
				totalChars = totalChars + word.length();
			}
			totalWords = totalWords + wordCount;
		}
		System.out.println("Total Number of Characters = " + totalChars);
		System.out.println("Total Number of Words = " + totalWords);
		System.out.println("Total Number of Lines = " + lineCount);
		in.close();
		userInput.close();
	}

}
