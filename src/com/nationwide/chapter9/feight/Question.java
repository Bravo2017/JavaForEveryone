package com.nationwide.chapter9.feight;


/**
 * Modify the checkAnswer method of the Question class so that it does not take
 * into account different spaces or upper/lowercase characters. For example, the
 * response "JAMES gosling" should match an answer of "James Gosling".
 * 
 * @author Suzanne Feight
 * 
 */

public class Question {
	private String text;
	private String answer;

	public Question() {
		text = "";
		answer = "";
	}

	public void setText(String questionText) {
		text = questionText;
	}

	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}

	public boolean checkAnswer(String response) {
		// return response.equals(answer);

		return response.replaceAll("\\s+", "").equalsIgnoreCase(
				answer.replaceAll("\\s+", ""));
	}

	public void display() {
		System.out.println(text);
	}

}
