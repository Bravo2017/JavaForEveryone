package com.nationwide.chapter7.garrett;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * P7.5 Write a program that asks the user for a file name and prints the number
 * of characters, words, and lines in that file.
 */

public class FileProcessor {

	public static void main(String[] args) throws FileNotFoundException {

		int chars = 0;
		int words = 0;
		int lines = 0;

		Scanner console = new Scanner(System.in);
		System.out.print("Please enter in file name: ");
		String inputFileName = console.next();

		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);

		while (in.hasNext()) {
			String tmpStr = in.nextLine();
			if (!tmpStr.equalsIgnoreCase("")) {
				String replaceAll = tmpStr.replaceAll("\\s+", "");
				chars += replaceAll.length();
				words += tmpStr.split(" ").length;
			}
			++lines;
		}

		System.out.println("Number of characters in " + inputFileName + " = "
				+ chars);
		System.out.println("Number of words in " + inputFileName + " = "
				+ words);
		System.out.println("Number of lines in " + inputFileName + " = "
				+ lines);

		in.close();
		console.close();
	}

}
