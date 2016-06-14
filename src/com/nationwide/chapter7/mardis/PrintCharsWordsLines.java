package com.nationwide.chapter7.mardis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintCharsWordsLines {

	/**
	 * print number of characters, words and lines
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = null;

		System.out.println("Enter the file name (Use printline.txt to test): ");
		Scanner in = new Scanner(System.in);
		fileName = in.nextLine();
		in.close();

		/* open file name entered above and display the floats */
		// String fileName1 = "printline.txt";
		File file = new File(fileName);

		Scanner rf = new Scanner(file);
		int wordCount = 0;
		int lineCount = 0;
		int charCount = 0;

		while (rf.hasNextLine()) {
			String line = rf.nextLine();
			System.out.println(line);
			lineCount++;
			Scanner ls = new Scanner(line);
			while (ls.hasNext()) {
				String w = ls.next();
				// System.out.println("words + " + w);
				wordCount++;
			}
			Scanner cs = new Scanner(line);
			cs.useDelimiter("");
			while (cs.hasNext()) {
				charCount++;
				String ch = cs.next();
				// System.out.println("char is " + ch);

			}

		}

		System.out.println("-------------");
		System.out.println("Total Number of lines is " + lineCount);
		System.out.println("Total Word count is " + wordCount);
		System.out.println("Total Character count is " + charCount);

	}

}
