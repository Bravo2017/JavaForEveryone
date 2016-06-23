package com.nationwide.chapter9.walker;

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
	
	/*
	 * Returns question text
	 */
	public String getText(){
		return text;
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
	
	/*
	 * Returns correct answer
	 */
	public String getAnswer(){
		return answer;
	}

	/**
	 * Checks a given response for correctness.
	 * 
	 * @param response
	 *            the response to check
	 * @return true if the response was correct, false otherwise
	 */
	public boolean checkAnswer(String response) {
		String responseTrimmed = response.replaceAll("\\s","");
		String answerTrimmed = answer.replaceAll("\\s","");
		return responseTrimmed.equalsIgnoreCase(answerTrimmed);
	}

	/**
	 * Displays this question.
	 */
	public void display() {
		System.out.println(text);
	}

	/*
	 * Displays the expected answer for testing
	 */
	public void testDisplay() {
		System.out.println("Expected Answer: " + answer);
	}
}
