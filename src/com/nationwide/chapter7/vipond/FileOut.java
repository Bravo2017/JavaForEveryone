package com.nationwide.chapter7.vipond;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Write a program that asks the user for a file name and prints the number of characters, words, and lines in that file.
 */

public class FileOut {

	public static void main(String[] args) throws FileNotFoundException {
		// Prompt for the output file name
		Scanner console = new Scanner(System.in);
		console = new Scanner(System.in);
		System.out.print("Input file name: ");
		String inputFileName = console.next();

		File inputFile = new File(inputFileName);
		// C:/Users/vipondc/javaclass/Input1.txt
		Scanner in = new Scanner(inputFile);
		// Read the input
		int word1 = 0;
		int characters = 0;
		while (in.hasNext()) {
			word1++;
			String word = in.next();
			characters = word.length() + characters;
		}
		System.out.println("Number of words: " + word1);
		System.out.println("Number of characters: " + characters);
		Scanner in2 = new Scanner(inputFile);
		// Read the input and write the output
		int lines1 = 0;
		while (in2.hasNextLine()) {
			lines1++;
			String line = in2.nextLine();
		}
		System.out.println("Number of lines: " + lines1);
		in.close();
		in2.close();

	}

}
