package com.nationwide.chapter7.watson;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment3 {

	/**
	 * Write a program that asks the user for a file name and prints the number
	 * of characters, words, and lines in that file.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		// // Use the following text: files/Assignment3.txt
		// // or C:/Users/jamesw3/Desktop/Java/Assignment3.txt
		// files/Assignment3.txt
		System.out.println("File to be read: ");
		String inputFile = console.next();

		File file = new File(inputFile);
		// File file = new File(
		// "C:/Users/jamesw3/Desktop/Java Class/Assignment3.txt");
		Scanner in = new Scanner(file);

		int words = 0;
		int lines = 0;
		int chars = 0;

		while (in.hasNextLine()) {
			lines++;
			String line = in.nextLine();
			chars += line.length();
			words += new StringTokenizer(line, " ,").countTokens();
		}

		System.out.println("Number of lines: " + lines);
		System.out.println("Number of words: " + words);
		System.out.println("Number of characters: " + chars);
	}
}
