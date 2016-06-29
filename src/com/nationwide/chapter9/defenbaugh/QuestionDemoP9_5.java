package com.nationwide.chapter9.defenbaugh;

import java.util.Scanner;

public class QuestionDemoP9_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiChoiceQuestionP9_5 q = new MultiChoiceQuestionP9_5();
		q.setText("Which of the following is a primary color? Provide all correct choices, separated by spaces.");
		q.addChoice("red", true);
		q.addChoice("purple", false);
		q.addChoice("green", false);
		q.addChoice("blue", true);

		displayQuestion(q);
	}

	/**
	 * Displays the question with possible answers and checks the response.
	 */
	public static void displayQuestion(ChoiceQuestion q) {
		q.display();
		System.out.print("Your answer: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	}
}
