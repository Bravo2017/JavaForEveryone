package com.nationwide.chapter7.garrett;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * P7.4 - Write a program that reads a file containing two columns of
 * floating-point numbers. Prompt the user for the file name. Print the average
 * of each column.
 */

public class PromptNumAvg {
	public static void main(String[] args) throws FileNotFoundException {
		String input;
		int count = 0;
		double sum1 = 0;
		double sum2 = 0;
		double totsum1 = 0;
		double totsum2 = 0;

		Scanner console = new Scanner(System.in);
		System.out.print("Please enter in file name: ");
		String inputFileName = console.next();

		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);

		while (in.hasNext()) {
			input = in.next();
			sum1 = Double.parseDouble(input);
			totsum1 = totsum1 + sum1;

			input = in.next();
			sum2 = Double.parseDouble(input);
			totsum2 = totsum2 + sum2;

			count++;
		}
		System.out.println("The average of the first column in "
				+ inputFileName + " is " + totsum1 / count);
		System.out.println("The average of the second column in "
				+ inputFileName + " is " + totsum2 / count);

		in.close();
		console.close();
	}
}
