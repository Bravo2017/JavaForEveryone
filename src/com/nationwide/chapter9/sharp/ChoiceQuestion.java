package com.nationwide.chapter9.sharp;

import java.util.ArrayList;

public class ChoiceQuestion extends Question {

	private ArrayList<String> choices;

	public ChoiceQuestion() {
		super();
	}

	public void addChoice(String choice, boolean correct) {
		choice += 1;
		super.addText(String.format("\n%d)%s", choices, choice));
		if (correct) {
			String choiceString = "" + choices;
			setAnswer(choiceString);
		}

	}

	public String toString() {
		return getClass().getName();

	}

}
