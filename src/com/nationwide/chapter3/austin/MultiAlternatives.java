package com.nationwide.chapter3.austin;

import java.util.Scanner;

public class MultiAlternatives {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter what hour it is in military time: ");
		int time = in.nextInt();

		if (time != 12)
			System.out.println("Since it is: " + time + " I will say: ");

		if (time < 12) {
			System.out.println("Good Morning");
		}

		if (time == 12) {
			System.out.println("Lunch Time");
		}
		if (time == 13) {
			System.out.println("Good Afternoon");
		}
		if (time == 14) {
			System.out.println("Good Afternoon");
		}
		if (time == 15) {
			System.out.println("Good Afternoon");
		}
		if (time == 16) {
			System.out.println("Good Afternoon");
		}
		if (time == 17) {
			System.out.println("Good Afternoon");
		}
		if (time > 17) {
			System.out.println("Good Evening");
		}
	}

}
