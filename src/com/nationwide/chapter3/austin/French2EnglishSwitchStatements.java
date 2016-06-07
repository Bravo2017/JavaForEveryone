package com.nationwide.chapter3.austin;

import java.util.Scanner;

public class French2EnglishSwitchStatements {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter number 1-10 to translate ");
		int french2english = in.nextInt();

		System.out.print("French translation of " + french2english + " is: ");
		switch (french2english) {

		case 1:
			System.out.println("Un");
			break;

		case 2:
			System.out.println("Deux");
			break;

		case 3:
			System.out.println("Trois");
			break;

		case 4:
			System.out.println("Quatre");
			break;

		case 5:
			System.out.println("Cinq");
			break;

		case 6:
			System.out.println("Six");
			break;

		case 7:
			System.out.println("Sept");
			break;

		case 8:
			System.out.println("Huit");
			break;

		case 9:
			System.out.println("Neuf");
			break;

		case 10:
			System.out.println("Dix");
			break;

		default:
			System.out.println("Nothing, because I said 1-10?!?");
			break;

		}

	}

}
