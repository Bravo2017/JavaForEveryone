package com.nationwide.chapter9.watson;

import java.util.Scanner;

import com.nationwide.chapter9.ChoiceQuestion;

public class QuestionDemo4 {
	public static void main(String[] args) {
		// Explanation of how to enter multiple answers if desired
		// System.out.println("These questions possibly have multiple answers.");
		// System.out.println();
		// System.out
		// .println("If giving multiple answers, please type the name and then a space");
		// System.out.println();
		// System.out.println("Example: Nick Terri");
		// System.out.println();
		// System.out.println();
		// System.out.println();

		MultiChoiceQuestion first = new MultiChoiceQuestion();
		first.setText("Who at our table probably got our homework done?");
		first.addChoice("Diana", true);
		first.addChoice("Nick", true);
		first.addChoice("Terri", true);
		first.addChoice("James", true);

		MultiChoiceQuestion second = new MultiChoiceQuestion();
		second.setText("Who at our table probably played some video games this weekend?");
		second.addChoice("Diana", true);
		second.addChoice("Nick", true);
		second.addChoice("Terri", false);
		second.addChoice("James", true);

		MultiChoiceQuestion third = new MultiChoiceQuestion();
		third.setText("And finally, who probably has next weeks homework already complete?");
		third.addChoice("Diana", false);
		third.addChoice("Nick", false);
		third.addChoice("Terri", true);
		third.addChoice("James", false);

		presentQuestion(first);
		presentQuestion(second);
		presentQuestion(third);
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
		System.out.println(q.checkMultiAnswer(response));
	}
}
