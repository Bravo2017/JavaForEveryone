package com.nationwide;

import java.util.Scanner;

public class QuestionDemo3 {

	public static void main(String[] args) {
		MultiChoiceQuestion first = new MultiChoiceQuestion();
		System.out
				.println("Please, pick ALL numbers that apply, leaving a space in between each");
		first.setText("Who are Warner Brother Cartoon Characters? ");
		first.addChoice("Goofy", false);
		first.addChoice("Bugs Bunny", true);
		first.addChoice("Yosemite Sam", true);
		first.addChoice("Mickey Mouse", false);
		first.addChoice("Foghorn Leghorn", true);

		presentQuestion(first);
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

	/**
	 * Presents a question to the user and checks the response.
	 * 
	 * @param q
	 *            the question
	 */
	public static void presentQuestion(Question q) {
		q.display();
		System.out.print("Your answer: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	}
}
