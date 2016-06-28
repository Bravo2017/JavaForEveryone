package com.nationwide.chapter9.raush;

/**
 * A question with a text and an answer.
 */
public class Question {
	private String text;
	private String answer;

	/**
	 * Constructs a question with empty question and answer.
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
		// return response.equals(answer);

		// toLowerCase will modify all characters to lowercase. This will
		// compare the 2 values in all lowercase.
		// However does not take into account the whitespace.
		// return response.toLowerCase().equals(answer.toLowerCase());

		// equalsIgnoreCase will ignore whether the case is upper or lower when
		// comparing
		// However does not take into account the whitespace.
		// I like this one better than the toLowerCase as its easier to read
		// return response.equalsIgnoreCase(answer);

		// equalsIgnoreCase will ignore whether the case is upper or lower when
		// comparing
		// replaceAll will look for all whitespace ("\\s") and remove it.
		// This method will ignore case and the whitespace.
		return response.replaceAll("\\s", "").equalsIgnoreCase(
				answer.replaceAll("\\s", ""));
	}

	/**
	 * Displays this question.
	 */
	public void display() {
		System.out.println(text);
	}
}
