package com.nationwide.chapter7.valerie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Chapter7_P7_1 {

	/**
	 * @author Valerie Defenbaugh Write a program that carries out the following
	 *         tasks: Open a file with the name hello.txt. Store the message
	 *         “Hello, World!” in the file. Close the file. Open the same file
	 *         again. Read the message into a string variable and print it.
	 */

	public static void main(String[] args) throws FileNotFoundException {

		// Construct a file object with the name hello.txt
		File inputFile = new File(
				"C:/Users/DEFENBV/Documents/Java/JavaForEveryone/hello.txt");

		// Construct a PrintWriter object with the file name
		PrintWriter out = new PrintWriter(
				"C:/Users/DEFENBV/Documents/Java/JavaForEveryone/hello.txt");

		// Write "Hello, World!" to the file
		out.println("Hello, Val!");

		// Close the file
		out.close();

		// Open the same file again
		inputFile = new File(
				"C:/Users/DEFENBV/Documents/Java/JavaForEveryone/hello.txt");

		// Construct a Scanner object
		Scanner in = new Scanner(inputFile);

		// Read the message into a string variable and print it.
		String fileMessage = in.nextLine();
		System.out.println(fileMessage);

		// Close the file
		in.close();

	}
}
