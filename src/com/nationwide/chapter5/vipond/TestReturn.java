package com.nationwide.chapter5.vipond;

import java.util.Scanner;

public class TestReturn {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter your First Name: ");
		String firstName = in.nextLine();
		System.out.print("Enter your Mom's First Name: ");
		String MomsName = in.nextLine();
		System.out.print("Enter your age: ");
		int userage = in.nextInt();
		TestReturn one = new TestReturn();
		one.oneParm(firstName);
		System.out.println(one.twoParms(userage, MomsName));

	}

	void oneParm(String FirstName) {
		System.out.println("Hello, " + FirstName + "!");
	}

	public String twoParms(int age, String MomName) {
		String welcome = "Your Mom, " + MomName
				+ ", was blessed when you were born " + age + " years ago!";
		return welcome;
	}

}
