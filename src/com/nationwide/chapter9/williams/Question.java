package com.nationwide.chapter9.williams;

/**
 * A question with text and an answer
 */
public class Question {
	private String text;
	private String answer;

	/**
	 * Constructs a question with an empty question and answer
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
	 * Set the answer for the question.
	 * 
	 * @param correctResponse
	 *            is the answer
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
		return (response.replaceAll("//s", "").equalsIgnoreCase(answer
				.replaceAll("//s", "")));
	}

	/**
	 * Displays this question.
	 */
	public void display() {
		System.out.println(text);
	}
}
