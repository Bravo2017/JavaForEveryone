package com.nationwide.chapter7.kuhl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assign7Four {

	/**
	 * Write a program that reads a file containing two columns of
	 * floating-point numbers. Prompt the user for the file name. Print the avg
	 * of each column. thanks Beth
	 */
	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(System.in);

		// average: file name
		System.out.println("Please enter the file name: ");
		String fileName = in.next();
		// File location
		File inputFile = new File("C:/Users/kuhln/" + fileName + ".txt");

		// scanner object
		Scanner fileWithTwoColumns = new Scanner(inputFile);

		while (fileWithTwoColumns.hasNextFloat()) {
			float avg = 0;
			// Read the first and 2nd
			for (int col = 1; col <= 2; col++) {
				float value = fileWithTwoColumns.nextFloat();
				avg = avg + value;
				if (col == 2) {
					avg = avg / 2;
					System.out.println(avg);
				}
			}
		}

		in.close();
	}

}
