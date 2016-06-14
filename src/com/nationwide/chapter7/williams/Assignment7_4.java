package com.nationwide.chapter7.williams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment7_4 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Input file:  ");
		String inputFileName = console.next();

		console.close();

		File inputFile = new File("C:/JavaForEveryone/files/" + inputFileName);
		try {
			Scanner in = new Scanner(inputFile);
			int i = 0;
			float columnOne = 0;
			float columnTwo = 0;
			int columnOneCount = 0;
			int columnTwoCount = 0;
			while (in.hasNextFloat()) {
				i = i + 1;
				if ((i % 2) == 0) {
					columnTwo = columnTwo + in.nextFloat();
					columnTwoCount = columnTwoCount + 1;
				} else {
					columnOne = columnOne + in.nextFloat();
					columnOneCount = columnOneCount + 1;
				}
			}
			System.out.printf("Average of Column One:  %,.2f%n",
					(columnOne / columnOneCount));
			System.out.printf("Average of Column Two:  %,.2f%n",
					(columnTwo / columnTwoCount));
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
