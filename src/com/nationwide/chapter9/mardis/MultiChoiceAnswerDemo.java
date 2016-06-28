package com.nationwide.chapter9.mardis;

import java.util.Scanner;

/**
 * This program shows a simple quiz with one question.
 */
public class MultiChoiceAnswerDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		MultiChoiceQuestion mcq = new MultiChoiceQuestion();
		mcq.setText("Which are fruits ");
		mcq.addChoice("Apple", true);
		mcq.addChoice("CORN", false);
		mcq.addChoice("BANANA", true);
		mcq.addChoice("orange", true);
		mcq.addChoice("Chocolate", false);

		mcq.display();
		System.out.print("Enter all correct answers separated by a space: ");
		String response = in.nextLine();
		System.out.println(mcq.checkAnswer(response));

		in.close();
	}
}