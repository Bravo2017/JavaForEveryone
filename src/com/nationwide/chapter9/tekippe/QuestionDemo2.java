package com.nationwide.chapter9.tekippe;

import java.util.Scanner;

/**
 * This program shows a simple quiz with two choice questions
 */
public class QuestionDemo2 {
	public static void main(String[] args) {
		ChoiceQuestion first = new MultiChoiceQuestion();
		System.out.println("Select all correct answers separated by spaces.");
		first.setText("Which of the following letter are vowel?");
		first.addChoice("A", true);
		first.addChoice("B", false);
		first.addChoice("C", false);
		first.addChoice("D", false);
		first.addChoice("E", true);

		ChoiceQuestion second = new ChoiceQuestion();

		second.setText("In which country was the inventor of Java born?");
		second.addChoice("Australia", false);
		second.addChoice("Canada", true);
		second.addChoice("Denmark", false);
		second.addChoice("United States", false);

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
