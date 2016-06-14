package com.nationwide.chapter7.davis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author DAVISK51
 */
// P7.4
// Write a program that reads a file containing two columns of
// floating-point numbers.
// Prompt the user for the file name.
// Print the average of each column.

public class P7Q4ReadFile2Columns {
	public static void main(String[] args) throws FileNotFoundException {

		// Get the file name
		Scanner userInput = new Scanner(System.in);
		System.out.println("WARNING: A NEW FILE WILL BE GENERATED FOR YOU");
		System.out
				.println("Do not enter a file that you do not want overwritten");
		System.out.println("Please, enter a new file name:");
		String fileName = userInput.nextLine();
		File p7Q4 = new File(fileName);

		// Write the file
		System.out.print("Your file named " + p7Q4);
		PrintWriter out = new PrintWriter(p7Q4);
		p7Q4WriteFile(out);

		// Read and calculate average
		Scanner in = new Scanner(p7Q4);
		System.out.println(" 1st Column    2nd Column");
		System.out.println("-----------  -----------");
		p7q4ReadFile(in);

	}

	// Write the file
	private static void p7Q4WriteFile(PrintWriter out) {
		for (int counter = 1; counter <= 8; counter++) {
			out.println((float) (Math.random() * 100) + " "
					+ (float) (Math.random() * 100));
		}
		out.close();
		System.out.println(" is written");
		System.out.println("");
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
