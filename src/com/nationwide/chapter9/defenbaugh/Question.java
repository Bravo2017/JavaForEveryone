package com.nationwide.chapter9.defenbaugh;

public class Question {
	private String text;
	private String answer;

	/**
	 * Constructs a question with empty question and answer.
	 * 
	 * @author Valerie Defenbaugh P9_03 Modify the checkAnswer method of the
	 *         Question class so that it does not take into account different
	 *         spaces or upper/lowercase characters. For example, the response
	 *         "JAMES gosling" should match an answer of "James Gosling".
	 */
	public Question() {
		text = "";
		answer = "";
	}

	/**
	 * Sets the question text.
	 * 
	 * @param questionText
	 *            the text of this question
	 */
	public void setText(String questionText) {
		text = questionText;
	}

	/**
	 * Sets the answer for this question.
	 * 
	 * @param correctResponse
	 *            the answer
	 */
	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}

	/**
	 * Checks a given response for correctness.
	 * 
	 * @param response
	 *            the response to check
	 * @return true if the response was correct, false otherwise
	 */
	public boolean checkAnswer(String response) {

		// Remove spaces in both strings and use String method equalsIgnoreCase
		// to compare the strings

		return response.equals(answer);
	}

	/**
	 * Displays this question.
	 */
	public void display() {
		System.out.println(text);
	}
}
