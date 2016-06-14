package com.nationwide.chapter7.watson;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2b {

	/**
	 * Write a program that reads a file containing two columns of
	 * floating-point numbers. Prompt the user for the file name. Print the
	 * average of each column.
	 */

	public static void main(String[] args) {
		// Scanner console = new Scanner(System.in);
		// System.out.print("Path to document: ");
		// String inputFileName = console.next();
		String inputFileName = "files/Excersize2.txt";
		Assignment2 obj = new Assignment2();
		obj.getFile(inputFileName);
	}

	String getFile(String fileName) {

		StringBuilder result = new StringBuilder("");

		// Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try {
			Scanner scanner = new Scanner(file);

			// ANAND - START
			int rowCounter = 0;
			int columnCounter = 0;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] splitArray = line.split("\t");
				columnCounter = splitArray.length;
				break;
			}
			float[] columnsTotalArr = new float[columnCounter];
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line).append("\n");
				String[] splitArray = line.split("\t");
				// System.out.println(splitArray.length);
				// System.out.println(splitArray[0] + " : " + splitArray[1]);

				for (int i = 0; i < columnCounter; i++) {
					columnsTotalArr[i] = columnsTotalArr[i]
							+ Float.parseFloat(splitArray[i]);
				}
				rowCounter++;
			}

			int rowCount = 1;
			for (float totalVal : columnsTotalArr) {
				System.out.println("Total Val for " + (rowCount) + " : "
						+ totalVal);
				System.out.println("Average Val for " + (rowCount) + " : "
						+ (totalVal / rowCounter));
				rowCount++;
			}

			// ANAND - END

			// while (scanner.hasNextLine()) {
			// String line = scanner.nextLine();
			// result.append(line).append("\n");
			// String[] splitArray = line.split("\t");
			// // System.out.println(splitArray.length);
			// // System.out.println(splitArray[0] + " : " + splitArray[1]);
			// total1 = total1 + Float.parseFloat(splitArray[0]);
			// total2 = total2 + Float.parseFloat(splitArray[1]);
			// counter++;
			// }

			scanner.close();
			// System.out.println("File Row Count : " + counter);
			//
			// System.out.println("Total for column 1: " + total1);
			// System.out.println("Average for column 1: " + (total1 /
			// counter));
			//
			// System.out.println("Total for column 2: " + total2);
			// System.out.println("Average for column 2: " + (total2 /
			// counter));

		} catch (IOException e) {
			e.printStackTrace();
		}

		return result.toString();

	}
}
