package com.nationwide.chapter9.lark;

import java.util.Scanner;

public class ChoiceQuestionDemo {

	public static void main(String[] args) {
		ChoiceQuestion first = new ChoiceQuestion();
		first.setText("What's the Capital of Iowa?");
		first.addChoice("Cedar Rapids", false);
		first.addChoice("Waterloo", false);
		first.addChoice("Des Moines", true);
		first.addChoice("Adel", false);

		ChoiceQuestion second = new ChoiceQuestion();
		second.setText("Who's the male lead in Casablanca?");
		second.addChoice("Mel Brooks", false);
		second.addChoice("Leondardo DeCaprio", false);
		second.addChoice("Herbert Hoover", false);
		second.addChoice("Humphrey Bogart", true);

		presentQuestion(first);
		presentQuestion(second);
	}

	public static void presentQuestion(ChoiceQuestion q) {
		q.display();
		System.out.println("Your answer: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
	}

}
