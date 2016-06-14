package com.nationwide.chapter7.ron;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JFEChapter7Ex5 {

	/**
	 * prompts user for a file name. counts number of character, words and lines
	 * in the file
	 * 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		// prompt user for file name
		Scanner console = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFileName = console.next();
		File inputFile = new File(inputFileName);

		int charCounter = 0;
		int wordCounter = 0;
		int lineCounter = 0;

		Scanner in = new Scanner(inputFile);
		in.useDelimiter("");

		while (in.hasNext()) {
			char ch = in.next().charAt(0);
			charCounter++;
		}
		in.close();
		Scanner in1 = new Scanner(inputFile);
		while (in1.hasNext()) {
			String input = in1.next();
			wordCounter++;
		}
		in1.close();
		Scanner in2 = new Scanner(inputFile);
		while (in2.hasNextLine()) {
			String line = in2.nextLine();
			lineCounter++;
		}
		in2.close();
		System.out.println("There are " + charCounter + " characters");
		System.out.println("There are " + wordCounter + " words.");
		System.out.println("There are " + lineCounter + " liness.");

	}
}
