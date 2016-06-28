package com.nationwide.chapter9.mardis;

import java.util.ArrayList;

public class MultiChoiceQuestion extends Question {

	private ArrayList<String> choices;

	public MultiChoiceQuestion() {
		choices = new ArrayList<String>();
	}

	/* add the choice to the array */
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			setAnswer(getAnswer() + choice);
		}
	}

	// display the question and answers
	public void display() {
		// display question
		super.display();

		// display answers
		for (int i = 0; i < choices.size(); i++) {
			System.out.println(choices.get(i));
		}
	}

	/**
	 * P9.5 allows multiple correct choices Choices are separated by spaces
	 * 
	 * @param response
	 *            the response to check
	 * @return true if the response was correct, false otherwise
	 */
	public boolean checkAnswer(String response) {
		return response.replace(" ", "").equalsIgnoreCase(
				getAnswer().replace(" ", ""));
	}
}
