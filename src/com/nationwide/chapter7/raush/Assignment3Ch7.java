package com.nationwide.chapter7.raush;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment3Ch7 {

	/**
	 * Write a program that asks the user for a file name and prints the number
	 * of characters, words, and lines in that file.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.print("Read from file name: ");
		String filenameRead = console.next();
		console.close();

		int characterCount = countCharacters(filenameRead);
		int wordCount = countWords(filenameRead);
		int lineCount = countLines(filenameRead);

		System.out.println("Number of characters: " + characterCount);
		System.out.println("Number of words: " + wordCount);
		System.out.println("Number of lines: " + lineCount);
	}

	public static int countCharacters(String filenameRead)
			throws FileNotFoundException {
		Scanner fileRead = new Scanner(new File(filenameRead));
		int characterCount = 0;
		while (fileRead.hasNextLine()) {
			String line = fileRead.nextLine();
			characterCount = characterCount + line.trim().length();
		}
		fileRead.close();
		return characterCount;
	}

	public static int countLines(String filenameRead)
			throws FileNotFoundException {
		Scanner fileRead = new Scanner(new File(filenameRead));
		int lineCount = 0;
		while (fileRead.hasNextLine()) {
			String line = fileRead.nextLine();
			lineCount++;
		}
		fileRead.close();
		return lineCount;
	}

	public static int countWords(String filenameRead)
			throws FileNotFoundException {
		Scanner fileRead = new Scanner(new File(filenameRead));
		int wordCount = 0;
		while (fileRead.hasNext()) {
			String word = fileRead.next();
			wordCount++;
		}
		fileRead.close();
		return wordCount;
	}
}
