package com.nationwide.chapter9.vipond;

import java.util.Scanner;

public class MultiChoiceTest {
	

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		MultiChoiceQuestion q = new MultiChoiceQuestion();
		q.setText("Name the colors of the rainbow");
		q.setAnswer("red");
		q.setAnswer("orange");
		q.setAnswer("yellow");
		q.setAnswer("green");
		q.setAnswer("blue");
		q.setAnswer("indigo");
		q.setAnswer("violet");

		q.display();
		System.out.print("Your answer: ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));

	}

}