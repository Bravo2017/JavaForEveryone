package com.nationwide.chapter7.kuhl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assign7one {

	public static void main(String[] args) throws FileNotFoundException {

		File inputFile = new File("C:/Users/kuhln/Hello.txt");

		// Construct a PrintWriter object with the file name
		PrintWriter out = new PrintWriter("C:/Users/kuhln/Hello.txt");

		// Write "Hello, World!" to the file
		out.write("Hello, World!");

		// Close the file
		out.close();

		// Open the file from above.
		inputFile = new File("C:/Users/kuhln/Hello.txt");

		// Construct a Scanner object.
		Scanner in = new Scanner(inputFile);

		// Read the message on input file created above and print to console
		String fileText = in.nextLine();
		System.out.println(fileText);

		// Close the file
		in.close();

	}
}
