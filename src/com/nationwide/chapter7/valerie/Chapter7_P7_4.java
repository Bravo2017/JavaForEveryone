package com.nationwide.chapter7.valerie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Chapter7_P7_4 {

	/**
	 * @author Valerie Defenbaugh Write a program that reads a file containing
	 *         two columns of floating-point numbers. Prompt the user for the
	 *         file name. Print the average of each column.
	 */
	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the file name: ");
		String fileName = in.next();

		// Construct a file object with the name hello.txt
		File inputFile = new File(
				"C:/Users/DEFENBV/Documents/Java/JavaForEveryone/" + fileName
						+ ".txt");

		// Construct a Scanner object
		Scanner fileData = new Scanner(inputFile);

		// As long as the first value read is a float
		while (fileData.hasNextFloat()) {
			float average = 0;
			// Read the first and 2nd column and get the average
			for (int col = 1; col <= 2; col++) {
				float value = fileData.nextFloat();
				average = average + value;
				if (col == 2) {
					average = average / 2;
					// Print the average value of the row
					System.out.println(average);
				}
			}
		}

		// Close the file
		in.close();
	}

}
