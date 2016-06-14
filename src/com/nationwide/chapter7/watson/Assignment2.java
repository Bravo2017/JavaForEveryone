package com.nationwide.chapter7.watson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {

	/**
	 * Write a program that reads a file containing two columns of
	 * floating-point numbers. Prompt the user for the file name. Print the
	 * average of each column.
	 */

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Path to document: ");
		String inputFileName = console.next();
		// Use files/Assignment2b.txt for input
		// String inputFileName = "files/Assignment2b.txt";
		Assignment2 obj = new Assignment2();
		System.out.println(obj.getFile(inputFileName));
	}

	String getFile(String fileName) {

		StringBuilder result = new StringBuilder("");

		// Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try {
			Scanner scanner = new Scanner(file);
			List<Float> column1 = new ArrayList<Float>();
			List<Float> column2 = new ArrayList<Float>();

			int counter = 0;

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line).append("\n");
				String[] splitArray = line.split("\t");
				// System.out.println(splitArray.length);
				// System.out.println(splitArray[0] + " : " + splitArray[1]);
				column1.add(Float.parseFloat(splitArray[0]));
				column2.add(Float.parseFloat(splitArray[1]));
				counter++;
			}

			scanner.close();
			// System.out.println(column1);
			// System.out.println(column2);
			// System.out.println(counter);

			float total1 = 0;
			for (float col1 : column1) {
				total1 = total1 + col1;
			}
			System.out.println("Total for column 1: " + total1);
			System.out.println("Average for column 1: " + (total1 / counter));

			float total2 = 0;
			for (float col2 : column2) {
				total2 = total2 + col2;
			}
			System.out.println("Total for column 2: " + total2);
			System.out.println("Average for column 2: " + (total2 / counter));

		} catch (IOException e) {
			e.printStackTrace();
		}

		return result.toString();

	}
}
