package com.nationwide.chapter7.raush;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment1Ch7 {

	/**
	 * Write a program that carries out the following tasks: Open a file with
	 * the name hello.txt.Store the message “Hello, World!” in the file. Close
	 * the file.Open the same file again.Read the message into a string variable
	 * and print it.
	 */

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "C:/Users/RAUSHD/Documents/Hello.txt";
		// Open File
		File inputFile = new File(fileName);

		writeToFile(fileName);
		printFileContents(inputFile);

	}

	// Wrote to file name Passed in
	public static void writeToFile(String filename)
			throws FileNotFoundException {
		try (PrintWriter outputFile = new PrintWriter(filename)) {
			outputFile.println("Hello, World!");
		} catch (FileNotFoundException exception) {
			System.out.println("File not found");
		}
	}

	// Wrote to Read file Passed in and print contents -
	/*
	 * NOTE: type passed in is File (not String) - when passing file name, the
	 * print statement printed the file path/name rather than contents'
	 */
	public static void printFileContents(File filename)
			throws FileNotFoundException {
		Scanner inputFile = new Scanner(filename);
		String contents = inputFile.nextLine();
		inputFile.close();
		System.out.println(contents);
	}
}
