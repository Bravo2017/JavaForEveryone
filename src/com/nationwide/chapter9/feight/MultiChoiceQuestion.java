package com.nationwide.chapter9.feight;

/**
 * Add a class MultiChoiceQuestion to the question hierarchy of Section 9.1 that
 * allows multiple correct choices. The respondent should provide all correct
 * choices, separated by spaces. Provide instructions in the question text.
 * 
 * @author Suzanne Feight
 * 
 */

public class MultiChoiceQuestion extends ChoiceQuestion {

	private String answer;

	public MultiChoiceQuestion() {

		super();
		answer = "";
	}

	@Override
	public void setAnswer(String correctResponse) {
		answer = answer + correctResponse;
	}

	@Override
	public boolean checkAnswer(String response) {
		boolean result = true;
		response = response.replaceAll("\\s+", "");

		if (answer.length() == response.length()) {
			for (int i = 0; i < answer.length(); i++) {
				if (!response.contains(answer.subSequence(i, i + 1))) {
					result = false;
					break;
				}
			}
		} else {
			result = false;
		}

		return result;
	}
}
