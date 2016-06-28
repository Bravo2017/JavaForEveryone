package com.nationwide.chapter9.lark;

import java.util.ArrayList;

public class ChoiceQuestion extends Question_9_3 {

	private ArrayList<String> choices;

	public ChoiceQuestion() {

		choices = new ArrayList<String>();
	}

	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			String choiceString = "" + choices.size();
			setAnswer(choiceString);
		}
	}

	public void display() {
		super.disply();
		for (int i = 0; i < choices.size(); i++) {
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + ": " + choices.get(i));
		}
	}

}
