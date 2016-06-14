package com.nationwide.chapter7.ron;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JFEChapter7Ex1 {

	/**
	 * opens a file, stores a message, closes the file opens the file again,
	 * reads the message and writes it.
	 * 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// create the PrintWriter for writing
		PrintWriter out = new PrintWriter("hello.txt");

		out.printf("Hello, World!");
		out.close();

		File inputFile = new File("hello.txt");
		Scanner in = new Scanner(inputFile);

		while (in.hasNextLine()) {
			String input = in.nextLine();
			System.out.println(input);
		}

	}

}
