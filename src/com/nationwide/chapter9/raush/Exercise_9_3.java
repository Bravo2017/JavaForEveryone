package com.nationwide.chapter9.raush;

import java.util.Scanner;

/**
 * This program shows a simple quiz with one question.
 */
public class Exercise_9_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Question q = new Question();
		q.setText("Who was the inventor of Java?");
		q.setAnswer("James Gosling");

		q.display();
		// System.out.print("Your answer: ");
		// String response = in.nextLine();
		String response = "james gosling";
		System.out.println(response);
		System.out.println(q.checkAnswer(response));

		response = "JAMES GOSLING";
		System.out.println(response);
		System.out.println(q.checkAnswer(response));

		response = "jAMES gOSLING";
		System.out.println(response);
		System.out.println(q.checkAnswer(response));

		response = "jAMESgOSLING";
		System.out.println(response);
		System.out.println(q.checkAnswer(response));
	}
}
