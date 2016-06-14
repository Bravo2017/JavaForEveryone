package com.nationwide.chapter7.watson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment1 {

	/**
	 * Write a program that carries out the following tasks: Open a file with
	 * the name hello.txt. Store the message “Hello, World!” in the file. Close
	 * the file. Open the same file again. Read the message into a string
	 * variable and print it.
	 */
	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter outputFile = new PrintWriter(
				"C:/Users/jamesw3/Desktop/Java Class/hello.txt");
		outputFile.println("Hello, World!");
		outputFile.close();

		File inputFile = new File(
				"C:/Users/jamesw3/Desktop/Java Class/hello.txt");
		Scanner in = new Scanner(inputFile);
		String previous = "";
		while (in.hasNext()) {
			String word = in.next();
			if (!word.equals(previous)) {
				System.out.print(word + " ");
			}
			previous = word;
		}
		System.out.println("");
		in.close();
	}

}
