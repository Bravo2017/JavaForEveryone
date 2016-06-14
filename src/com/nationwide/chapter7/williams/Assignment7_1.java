package com.nationwide.chapter7.williams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment7_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Input file:  ");
		String inputFileName = console.next();
		System.out.print("Output file:  ");
		String outputFileName = console.next();

		PrintWriter out = null;
		try {
			out = new PrintWriter("C:/JavaForEveryone/files/" + outputFileName);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		out.println("Hello World!");
		out.close();
		console.close();

		File inputFile = new File("C:/JavaForEveryone/files/" + inputFileName);
		try {
			Scanner in = new Scanner(inputFile);
			while (in.hasNext()) {
				System.out.print(in.next() + " ");
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
