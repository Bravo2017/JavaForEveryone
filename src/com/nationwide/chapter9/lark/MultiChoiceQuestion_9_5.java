package com.nationwide.chapter9.lark;

import java.util.ArrayList;

public class MultiChoiceQuestion_9_5 extends ChoiceQuestion {

	private ArrayList<String> answers;

	public MultiChoiceQuestion_9_5() {

		answers = new ArrayList<String>();

	}

	public void addChoice(String choice, boolean correct) {
		super.addChoice(choice, correct);
		if (correct) {
			String answer = getAnswer();
			answers.add(answer + " ");
		}
	}

	public void setAnswer() {
		String answerString = "";
		for (String s : answers) {
			answerString += s;
		}
		super.setAnswer(answerString);
	}

}
