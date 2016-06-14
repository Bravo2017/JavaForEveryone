package com.nationwide.chapter7.davis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author DAVISK51
 */
// P7.4
// Write a program that reads a file containing two columns of
// floating-point numbers.
// Prompt the user for the file name.
// Print the average of each column.

public class P7Q4ReadOnlyFile2Columns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Get the file name
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please, enter file name:");
		String fileName = userInput.nextLine();
		File p7Q5 = new File(fileName);

		// Check to see if file exists
		Scanner in = null;
		try {
			in = new Scanner(p7Q5);
			System.out.println(" 1st Column    2nd Column");
			System.out.println("-----------  -----------");
			p7q4ReadFile(in);

		} catch (FileNotFoundException e) {
			System.out.println("\n ");
			System.out.println("File " + p7Q5
					+ " is not found.  Please, try again.");
			System.out.println("\n ");
			e.printStackTrace();

		}

	}

	// Read and calculate average
	private static void p7q4ReadFile(Scanner in) {
		float total1 = 0;
		float total2 = 0;
		int count = 0;
		while (in.hasNextFloat()) {
			float in1 = in.nextFloat();
			total1 = total1 + in1;
			float in2 = in.nextFloat();
			total2 = total2 + in2;
			count++;
			System.out.println(" " + in1 + "      " + in2);
		}
		in.close();
		float avgTotal1 = total1 / count;
		float avgTotal2 = total2 / count;
		System.out.println("___________   ___________");
		System.out.println(" ");
		System.out.println(total1 + "       " + total2 + "  Totals / " + count
				+ " =");
		System.out.println(avgTotal1 + "      " + avgTotal2 + " Averages");

	}

}