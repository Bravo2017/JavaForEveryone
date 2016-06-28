package com.nationwide.chapter9.vanwyk;

/*
 * Modify the checkAnswer method of the Question class so that it does not take into account 
 * different spaces or upper/lowercase characters. 
 * For example, the response "JAMES gosling" should match an answer of "James Gosling".
 */

public class Question {

	private String text;
	private String answer;

	/*
	 * Constructs a question with empty question and answer.
	 */

	public Question() {
		text = "";
		answer = "";
	}

	/*
	 * Sets the question text.
	 */

	public void setText(String questionText) {
		text = questionText;
	}

	/*
	 * Sets the answer for this question.
	 */
	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}

	/*
	 * Checks a given response for correctness. changes responseAnswer to
	 * lowercase if correct will display true, if incorrect will display false
	 */

	public boolean checkAnswer(String response) {
		String responseAnswer = this.getAnswer().toLowerCase(); // this is what
																// changes
																// answer to
		String realAnswer = this.getAnswer().toLowerCase(); // ignore case
															// sensitivity

		return realAnswer.equals(responseAnswer);
	}

	private String getAnswer() {
		return this.answer;
	}

	/*
	 * Displays this question.
	 */

	public void display() {
		System.out.println(text);
	}

}
