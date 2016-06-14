package com.nationwide.chapter7.vipond;

/*
 * Write a program that carries out the following tasks:
 *•	Open a file with the name hello.txt.
 *•	Store the message “Hello, World!” in the file.
 *•	Close the file.
 *•	Open the same file again.
 *•	Read the message into a string variable and print it.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWrite {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter out = new PrintWriter("hello.txt");
		out.println("Hello, World!");
		out.close();

		File inputFile = new File("hello.txt");
		Scanner in = new Scanner(inputFile);
		while (in.hasNext()) {
			String word = in.next();
			System.out.print(word);
			System.out.print(" ");
		}
		in.close();
	}

}