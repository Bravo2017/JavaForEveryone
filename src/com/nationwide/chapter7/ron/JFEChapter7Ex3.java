package com.nationwide.chapter7.ron;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JFEChapter7Ex3 {

	/**
	 * prompts user for a file name. Reads in 2 columns of Floating point
	 * numbers and finds the average of each column.
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// prompt user for file name
		Scanner console = new Scanner(System.in);
		System.out.print("Input file: ");
		String inputFileName = console.next();
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		int counter = 0;
		int counter1 = 0;
		float total1 = 0;
		float average1 = 0;
		int counter2 = 0;
		float total2 = 0;
		float average2 = 0;

		while (in.hasNextDouble()) {
			counter++;
			float value = in.nextFloat();
			if (counter % 2 != 0) {
				total1 = total1 + value;
				counter1++;
			} else {
				total2 = total2 + value;
				counter2++;
			}
		}
		average1 = total1 / counter1;
		average2 = total2 / counter2;
		System.out.println(total1 + "    " + counter1);
		System.out.println(total2 + "    " + counter2);
		System.out.println(" The average of the first column is:  " + average1);
		System.out
				.println(" The average of the second column is:  " + average2);

	}

}
