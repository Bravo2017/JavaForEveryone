package com.nationwide.chapter7.feight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Write a program that reads a file containing two columns of floating-point
 * numbers. Prompt the user for the file name. Print the average of each column.
 * 
 * @author Suzanne Feight
 * 
 */

public class P7_4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {

		String inptFilePrefix = "C:\\JavaForEveryone\\src\\com\\nationwide\\jfe\\chapter7\\homework\\";
		Scanner console = new Scanner(System.in);

		System.out.print("Input file name: ");
		String inputFile = inptFilePrefix + console.next();
		Scanner in = new Scanner(new File(inputFile));

		float columnOne = 0;
		float columnTwo = 0;
		int countOne = 0;
		int countTwo = 0;

		while (in.hasNextFloat()) {
			float value1 = in.nextFloat();
			columnOne += value1;
			countOne++;

			float value2 = in.nextFloat();
			columnTwo += value2;
			countTwo++;
		}
		System.out.println("Column 1 average : " + columnOne / countOne);
		System.out.println("Column 2 average : " + columnTwo / countTwo);

		in.close();

	}
}
