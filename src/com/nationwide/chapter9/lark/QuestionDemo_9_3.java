package com.nationwide.chapter9.lark;

import java.util.Scanner;

public class QuestionDemo_9_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Question_9_3 q = new Question_9_3();
		q.setText("Who was the inventor of Java");
		q.setAnswer("James Gosling");

		q.disply();
		System.out.print("Your Answer: ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));

		in.close();
	}

}