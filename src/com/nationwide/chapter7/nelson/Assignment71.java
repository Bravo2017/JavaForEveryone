package com.nationwide.chapter7.nelson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment71 {

	/*
	 * Write a program that carries out the following tasks: - Open a file with
	 * the name hello.txt - Store the message "Hello World!" in the file. -
	 * Close the file. - Open the same file again. - Read the message into a
	 * string variable and print it.
	 */
	public Assignment71() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		String inputFileName = ("C:/Users/nelsot17/Documents/hello.txt");
		String outputFileName = ("C:/Users/nelsot17/Documents/hello.txt");

		// Open the input file with the file name hello.txt
		File inputFile = new File(inputFileName);

		// Store the message "Hello World! in the file
		PrintWriter outputFile = new PrintWriter(outputFileName);
		outputFile.println("Hello World!");

		// Close the file
		outputFile.close();

		// Open the same file again
		Scanner in = new Scanner(inputFile);

		// Read the message into a string variable and print it
		while (in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(line);
		}

		// Close the file
		in.close();
	}

}