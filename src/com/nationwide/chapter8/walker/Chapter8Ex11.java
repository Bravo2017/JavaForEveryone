package com.nationwide.chapter8.walker;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * Letter Example
 */

public class Chapter8Ex11 {
	String from;
	String to;
	ArrayList<String> letterBody = new ArrayList<String>();

	public Chapter8Ex11(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public void addLine(String line) {
		letterBody.add(line);
	}

	public void printLetter() {
		System.out.println("Dear " + to + ":");
		System.out.println("");
		for (String s : this.letterBody) {
			System.out.println(s);
		}
		System.out.println("");
		System.out.println("Sincerely,");
		System.out.println("");
		System.out.println(from);
	}

	public static void main(String[] args) throws IOException {

		String from;
		String to;
		String line;
		int userChoice = 1;
		Scanner in = new Scanner(System.in);
		BufferedReader inLine = new BufferedReader(new InputStreamReader(
				System.in));

		System.out.print("Enter the name of the sender: ");
		from = inLine.readLine();
		System.out.print("Enter the name of the recipient: ");
		to = inLine.readLine();
		Chapter8Ex11 letter = new Chapter8Ex11(from, to);
		do {
			System.out.println("1. Add line to letter body");
			System.out.println("2. Print letter");
			System.out.println("0. Exit");
			System.out.print("Enter selection: ");
			userChoice = in.nextInt();
			if (userChoice == 1) {
				System.out.print("Add line: ");
				line = inLine.readLine();
				letter.addLine(line);
			}
			if (userChoice == 2) {
				letter.printLetter();
			}
			if (userChoice == 0) {
				break;
			}
			System.out.println("");
		} while (userChoice != 0);
		in.close();
	}

}
