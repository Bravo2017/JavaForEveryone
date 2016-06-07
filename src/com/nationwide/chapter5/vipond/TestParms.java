package com.nationwide.chapter5.vipond;

import java.util.Scanner;

public class TestParms {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter your First Name: ");
		String firstName = in.nextLine();
		System.out.print("Enter your Mom's First Name: ");
		String MomsName = in.nextLine();
		System.out.print("Enter your age: ");
		int userage = in.nextInt();
		TestParms one = new TestParms();
		one.noParms();
		one.oneParm(firstName);
		one.twoParms(userage, MomsName);
	}

	void noParms() {
		System.out.println("No input needed here!!");
	}

	void oneParm(String FirstName) {
		System.out.println("Hello, " + FirstName + "!");
	}

	void twoParms(int age, String MomName) {
		System.out.println("Your Mom, " + MomName
				+ ", was blessed when you were born " + age + " years ago!");
	}
}
