package com.nationwide.chapter7.vipond;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Write a program that reads a file containing two columns of floating-point numbers. 
 * Prompt the user for the file name. 
 * Print the average of each column.
 */

public class Avg {

	public static void main(String[] args) throws FileNotFoundException {

		// Prompt for the output file name
		Scanner console = new Scanner(System.in);
		console = new Scanner(System.in);
		System.out.print("Input file name: ");
		String inputFileName = console.next();
		// Prompt for the output file name
		System.out.print("Output file name: ");
		String outputFileName = console.next();
		// read file that has 2 columns of floating point numbers
		File inputFile = new File(inputFileName);
		// File inputFile = new
		// File("C:/Users/vipondc/javaclass/NumbersInput.txt");
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
		// Read the input and write the output
		int col1 = 0;
		int col2 = 0;
		float total = 0;
		float total2 = 0;
		while (in.hasNextFloat()) {
			float value = in.nextFloat();
			out.printf("%15.5f", value);
			total = total + value;
			col1++;
			if (in.hasNextFloat()) {
				float value2 = in.nextFloat();
				out.printf("%15.5f\n", value2);
				total2 = total2 + value2;
				col2++;
			}
		}
		float avg1 = total / col1;
		float avg2 = total2 / col2;
		out.printf("Avg: %10.5f", avg1);
		out.printf("%15.5f\n", avg2);
		in.close();
		out.close();

		System.out.printf("Average of column1:%6.5f\n", avg1);
		System.out.printf("Average of column2:%6.5f\n", avg2);

	}

}
