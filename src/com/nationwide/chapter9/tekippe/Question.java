package com.nationwide.chapter9.tekippe;

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
		answer = answer + correctResponse;
		System.out.println("value in answer is:  " + answer);
	}

	/**
	 * Checks a given response for correctness.
	 * 
	 * @param response
	 *            the response to check
	 * @return true if the response was correct, false otherwise
	 */
	public boolean checkAnswer(String response) {
		String response1 = response.replaceAll("\\s+", "");
		return response1.equalsIgnoreCase(answer);
	}

	/**
	 * Displays this question.
	 */
	public void display() {
		System.out.println(text);
	}
}
