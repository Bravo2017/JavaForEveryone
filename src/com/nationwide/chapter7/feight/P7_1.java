package com.nationwide.chapter7.feight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a program that carries out the following tasks:
 * 
 * Open a file with the name hello.txt. Store the message “Hello, World!” in the
 * file. Close the file. Open the same file again. Read the message into a
 * string variable and print it.
 * 
 * @author Suzanne Feight
 */

public class P7_1 {

	public static void main(String[] args) throws FileNotFoundException {

		String inputFile = "C:\\JavaForEveryone\\src\\com\\nationwide\\jfe\\chapter7\\homework\\hello.txt";
		Scanner in = new Scanner(new File(inputFile));

		String outputFile = "C:\\JavaForEveryone\\src\\com\\nationwide\\jfe\\chapter7\\homework\\hello.txt";
		PrintWriter out = new PrintWriter(outputFile);

		String outputString = "";

		out.print("Hello, World!");
		out.close();

		while (in.hasNext()) {
			String input = in.next();
			outputString = outputString + input + " ";
		}

		System.out.print(outputString);
		in.close();

	}
}
