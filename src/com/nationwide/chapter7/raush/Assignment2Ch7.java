package com.nationwide.chapter7.raush;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment2Ch7 {

	/**
	 * Write a program that reads a file containing two columns of
	 * floating-point numbers. Prompt the user for the file name. Print the
	 * average of each column
	 */
	static int lineNumber = 1;

	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		System.out.print("Read from file name: ");
		String fileRead = console.next();
		console.close();

		Scanner fileInput = new Scanner(new File(fileRead));

		double columnATotal = 0;
		double columnBTotal = 0;
		int columnACount = 0;
		int columnBCount = 0;

		while (fileInput.hasNext()) {
			String[] line = fileInput.nextLine().split("\\s+");
			double columnA = Double.parseDouble(line[0]);
			double columnB = Double.parseDouble(line[1]);
			double average = (columnA + columnB) / 2;

			columnATotal = columnATotal + columnA;
			columnBTotal = columnBTotal + columnB;
			columnACount = columnACount + 1;
			columnBCount = columnBCount + 1;

			/*
			 * System.out.print(columnA + "          " + columnB + "          "
			 * + "Row average: " + average); System.out.println();
			 */
		}
		double averageAColumn = columnATotal / columnACount;
		System.out.printf("Column A Total = %.2f" + "       Count = %d "
				+ "       Average: %.2f", columnATotal, columnACount,
				(columnATotal / columnACount));
		System.out.println();
		System.out.printf("Column B Total = %.2f" + "        Count = %d"
				+ "        Average: %.2f", columnBTotal, columnBCount,
				(columnBTotal / columnBCount));

		fileInput.close();
	}

}
