package com.nationwide.chapter9.vanwyk;

import java.util.ArrayList;

/*
 * Add a class MultiChoiceQuestion to the question hierarchy of Section 9.1 that allows
 *  multiple correct choices. The respondent should provide all correct choices, separated
 *   by spaces. Provide instructions in the question text.
 */
public class MultiChoiceQuestion extends ChoiceQuestion {

	private ArrayList<String> choices;

	/**
	 * Constructs a choice question with no choices.
	 * 
	 * @return
	 */
	public void ChoiceQuestion() {
		choices = new ArrayList<String>();
	}

	/**
	 * Adds an answer choice to this question.
	 * 
	 * @param choice
	 *            the choice to add
	 * @param correct
	 *            true if this is the correct choice, false otherwise
	 */
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			// Convert choices.size() to string
			String choiceString = "" + choices.size();
			setAnswer(choiceString);
		}
	}

	public void display() {
		// Display the question text
		super.display();
		// Display the answer choices
		System.out
				.println("Choose all the correct answers. Enter space between answers"); // this
																							// prompts
																							// user
																							// to
																							// enter
																							// all
																							// answers
		for (int i = 0; i < choices.size(); i++) {
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + ": " + choices.get(i));
		}
	}
}
