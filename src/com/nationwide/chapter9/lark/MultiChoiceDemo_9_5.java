package com.nationwide.chapter9.lark;

import java.util.Scanner;

public class MultiChoiceDemo_9_5 {

	public static void main(String[] args) {
		MultiChoiceQuestion_9_5 first = new MultiChoiceQuestion_9_5();
		first.setText("What MLB Baseball teams call NY home?");
		first.addChoice("Yankees", true);
		first.addChoice("Rays", false);
		first.addChoice("Mets", true);
		first.addChoice("Phillies", false);
		first.setAnswer();

		MultiChoiceQuestion_9_5 second = new MultiChoiceQuestion_9_5();
		second.setText("What are the primary colors");
		second.addChoice("Green", false);
		second.addChoice("Yellow", true);
		second.addChoice("Red", true);
		second.addChoice("Blue", true);
		second.setAnswer();

		System.out
				.println("Please pick all correct answers and type them out in numeric order with spaces between each answer.");
		presentQuestion(first);
		presentQuestion(second);
	}

	public static void presentQuestion(MultiChoiceQuestion_9_5 q) {
		q.display();
		System.out.println("Your answer: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	}

}
