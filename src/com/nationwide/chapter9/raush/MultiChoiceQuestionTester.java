package com.nationwide.chapter9.raush;

import java.util.Scanner;

/**
 * This program shows a simple quiz with one choice questions.
 */
public class MultiChoiceQuestionTester {
	public static void main(String[] args) {
		MultiChoiceQuestion first = new MultiChoiceQuestion();
		first.setText("What states are in the Midwest language?");
		first.addChoice("Pennsylvania", false);
		first.addChoice("California", false);
		first.addChoice("Iowa", true);
		first.addChoice("Wisconsin", true);

		presentQuestion(first);

	}

	/**
	 * Presents a question to the user and checks the response.
	 * 
	 * @param q
	 *            the question
	 */
	public static void presentQuestion(MultiChoiceQuestion q) {
		q.display();
		System.out.print("Your answer: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		q.checkAnswer(response);
		System.out.println(q.checkAnswer(response));
	}
}
