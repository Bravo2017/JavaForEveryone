package com.nationwide.chapter9.kuhl;

import java.util.Scanner;

/**
 * This program shows a simple quiz with two choice questions.
 */
public class ChoiceQuestionTester {
	public static void main(String[] args) {
		ChoiceQuestion first = new ChoiceQuestion();
		first.setText("What is the Greatest Band Ever?");
		first.addChoice("White Snake", false);
		first.addChoice("any hip hop music", false);
		first.addChoice("Social Distortion ", true);
		first.addChoice("Minor Threat", true);
		first.addChoice("Descendets", true);

		ChoiceQuestion second = new ChoiceQuestion();
		second.setText("Who is the greatest singer of all time?");
		second.addChoice("Nick Cool", false);
		second.addChoice("Nick Kuhl", true);
		second.addChoice("Anyone Else", false);

		presentQuestion(first);
		presentQuestion(second);
	}

	/**
	 * Presents a question to the user and checks the response.
	 * 
	 * @param q
	 *            the question
	 */
	public static void presentQuestion(ChoiceQuestion q) {
		q.display();
		System.out.print("Your answer: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	}
}