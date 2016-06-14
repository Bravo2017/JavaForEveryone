package com.nationwide.chapter7.mardis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class ReadFloats {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String fileName = null;

		System.out
				.println("Enter the file name (Use floatingpoint.txt to test): ");
		Scanner in = new Scanner(System.in);
		fileName = in.nextLine();
		in.close();

		/* open file name entered above and display the floats */
		// String fileName1 = "floatingpoint.txt";
		File file = new File(fileName);
		double total1 = 0;
		double count1 = 0;
		double total2 = 0;
		double count2 = 0;
		int c = 1;

		try {
			Scanner fp = new Scanner(file);
			while (fp.hasNextFloat()) {
				float x = fp.nextFloat();
				if (c % 2 == 0) {
					total2 = total2 + x;
					count1++;
				} else {
					total1 = total1 + x;
					count2++;
				}
				System.out.println(x);
				c++;
				// System.out.println("next is " + fp);
			}
			fp.close();
			System.out
					.println("total 1 is " + total1 + " count 1 is " + count1);
			System.out
					.println("total 2 is " + total2 + " count 2 is " + count2);
			System.out.println("Average of column 1 is " + total1 / count1);
			System.out.println("Average of column 2 is " + total2 / count2);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File is not found");
			// e.printStackTrace();
		}
	}

}
