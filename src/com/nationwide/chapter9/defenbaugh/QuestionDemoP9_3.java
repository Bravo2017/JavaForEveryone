package com.nationwide.chapter9.defenbaugh;

import java.util.Scanner;

public class QuestionDemoP9_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		QuestionP9_3 q = new QuestionP9_3();
		q.setText("Who was the inventor of Java?");
		q.setAnswer("James Gosling");

		q.display();
		System.out.print("Your answer: ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	}
}
