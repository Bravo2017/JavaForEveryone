package com.nationwide.chapter7.nelson;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Assignment74 {

	/*
	 * Write a program that reads a file containing two columns of
	 * floating-point numbers. - Prompt the user for the file name - Print the
	 * average of each column
	 */
	public Assignment74() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		// Prompt the user for the file name containing two columns of
		// floating-point numbers
		// "C:/Users/nelsot17/Documents/floating-point-file.txt"
		Scanner console = new Scanner(System.in);
		System.out
				.println("Enter file name containing floating-point numbers: ");
		String inputFileName = console.next();

		// Close the console file
		console.close();

		// Open the floating point file
		File inputFile = new File(inputFileName);

		// Read the file
		Scanner in = new Scanner(inputFile);

		// Declare fields for column 1 total, column 2 total, and record count
		double columnOneTotal = 0;
		double columnTwoTotal = 0;
		int recordCount = 0;

		// process all records on the file and accumulate a total for columns 1
		// and 2
		// and count the number of records read
		while (in.hasNextLine()) {
			String line[] = in.nextLine().split("\\s+");
			double columnOne = Double.parseDouble(line[0]);
			double columnTwo = Double.parseDouble(line[1]);
			columnOneTotal = columnOneTotal + columnOne;
			columnTwoTotal = columnTwoTotal + columnTwo;
			recordCount = recordCount + 1;
		}

		System.out.println("  ");
		System.out.println("Column One Total:   " + columnOneTotal);
		System.out.println("Column Two Total:   " + columnTwoTotal);
		System.out.println("Record Count:       " + recordCount);

		// Calculate the average for column 1 and column 2
		double averageColumn1 = columnOneTotal / recordCount;
		double averageColumn2 = columnTwoTotal / recordCount;

		// Print the average of each column
		System.out.println("  ");
		System.out.println("Column One Average: " + averageColumn1);
		System.out.println("Column Two Average: " + averageColumn2);

		// Close the floating point file
		in.close();

	}

}
