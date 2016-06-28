package com.nationwide.chapter9.sharp;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiCorrectChoice extends ChoiceQuestion {
	private ArrayList<String> allChoices;

	public MultiCorrectChoice() {
		super();
		this.allChoices = new ArrayList<String>();

	}

	public void setAnswer(String correctResponse) {
		this.allChoices.add(correctResponse);

	}

	public boolean checkAnswer(String response) {
		Scanner parser = new Scanner(response);
		ArrayList<String> correctAnswersSeen = new ArrayList<String>();
		int totalAnswers = 0;
		while (parser.hasNext()) {
			String answer = parser.next();
			if (this.allChoices.contains(answer)
					&& !correctAnswersSeen.contains(answer)) {
				correctAnswersSeen.add(answer);
			}
			totalAnswers += 1;
			parser.close();
		}
		return correctAnswersSeen.size() == this.allChoices.size()
				&& totalAnswers == allChoices.size();
	}

	public void display() {
		super.display();
		System.out
				.println("Please note that there can be several correct answers. Please list all of them by seperating by spaces.");

	}
}
