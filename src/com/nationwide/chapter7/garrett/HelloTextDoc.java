package com.nationwide.chapter7.garrett;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * P7.1 - Open a file, store a message in it, close it, reopen it, read it, and
 * print it out.
 */

public class HelloTextDoc {

	public static void main(String[] args) throws FileNotFoundException {

		PrintWriter out = new PrintWriter("hello.txt");
		out.println("Hello, World!");
		out.close();

		Scanner in = new Scanner(new File("hello.txt"));
		String message = in.nextLine();
		System.out.println(message);
		in.close();
	}

}
