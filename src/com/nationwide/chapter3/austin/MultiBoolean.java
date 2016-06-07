package com.nationwide.chapter3.austin;

import java.util.Scanner;

public class MultiBoolean {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean thirsty = true;

		String drink = "drinks";

		System.out.println("How many drinks");
		int numberOfDrinks = in.nextInt();

		if (numberOfDrinks >= 3) {
			thirsty = false;
		}

		if (thirsty && drink.equals("drinks")) {
			System.out.println("and operator");
		}

		if (thirsty || drink.equals("drinks")) {
			System.out.println("or operatior");
		}

		if (thirsty != drink.equals("drinks")) {
			System.out.println("not operator");
		}
	}

}
