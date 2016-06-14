package com.nationwide.chapter7.mardis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String fileName = "hello.txt";

		/* create file hello.txt and write Hello, World! to it */

		try {
			PrintWriter pw = new PrintWriter(fileName);
			pw.println("Hello, World!");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/* open file hello.txt and read in the line and display it */
		File file = new File(fileName);
		try {
			Scanner in = new Scanner(file);
			while (in.hasNextLine()) {
				String input = in.nextLine();
				System.out.println(input);
			}
			in.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
