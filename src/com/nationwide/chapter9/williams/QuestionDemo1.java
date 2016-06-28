package com.nationwide.chapter9.williams;

import java.util.Scanner;

/**
 * This program shows a simple quiz with an answer
 */
public class QuestionDemo1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Question q = new Question();
		q.setText("Who was the inventor of Java?");
		q.setAnswer("James Gossling");

		q.display();
		System.out.println("Your answer:  ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	}

}
