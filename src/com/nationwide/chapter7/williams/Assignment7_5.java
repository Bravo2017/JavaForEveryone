package com.nationwide.chapter7.williams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment7_5 {

	public static void main(String[] args) {
		int lineCounter = 0;
		int wordCounter = 0;
		int characterCounter = 0;
		String line = "";
		String word = "";
		char character;

		Scanner console = new Scanner(System.in);
		System.out.print("Input file:  ");
		String inputFileName = console.next();

		File inputFile = new File("C:/JavaForEveryone/files/" + inputFileName);
		// File fileForLines = new File("C:/JavaForEveryone/files/" +
		// inputFileName);

		console.close();
		try {
			Scanner lines = new Scanner(inputFile);
			while (lines.hasNextLine()) {
				line = lines.nextLine();
				lineCounter = lineCounter + 1;
			}
			if (lineCounter > 1) {
				System.out.println("File has " + lineCounter + " lines.");
			} else {
				System.out.println("File has " + lineCounter + " line.");
			}
			Scanner words = new Scanner(inputFile);
			while (words.hasNext()) {
				word = words.next();
				wordCounter = wordCounter + 1;
			}
			if (wordCounter > 1) {
				System.out.println("File has " + wordCounter + " words.");
			} else {
				System.out.println("File has " + wordCounter + " word.");
			}
			Scanner characters = new Scanner(inputFile);
			characters.useDelimiter("");
			while (characters.hasNext()) {
				character = characters.next().charAt(0);
				characterCounter = characterCounter + 1;
			}
			if (characterCounter > 1) {
				System.out.println("File has " + characterCounter
						+ " characters.");
			} else {
				System.out.println("File has " + characterCounter
						+ " character.");
			}
			lines.close();
			// words.close();
			characters.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
