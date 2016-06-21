package com.nationwide.chapter7.thurston;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInputFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner fileName = new Scanner(System.in);

		System.out.println("What file would you like to open?");
		System.out.println("Please enter directory path");
		String a = fileName.next();

		File userOpened = new File(a);
		Scanner fileRead = new Scanner(userOpened);
		int spaceCounter = 0;
		while (fileRead.hasNext(" ")) {
			spaceCounter++;
		}
		System.out.println(spaceCounter + "Spaces");
		System.out.println();
		// Scanner fileRead2 = new Scanner(userOpened);
		// int wordCounter = 0;

		Scanner sc = new Scanner(new FileInputStream(userOpened));
		{
			int count = 0;
			while (sc.hasNext()) {
				sc.next();
				count++;
			}
			System.out.println("Number of words: " + count);
		}

		fileName.close();
		fileRead.close();

	}

}