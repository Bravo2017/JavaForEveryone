package com.nationwide.chapter9.vipond;

/*
 * Modify the checkAnswer method of the Question class so that it does not take
 * into account different spaces or upper/lowercase characters. 
 * For example, the response "JAMES gosling" should match an answer of "James Gosling".
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

	// use equalsIgnorCase to ignore it they put lower or upper case (p9.3)
	public boolean checkAnswer(String response) {
		return response.equalsIgnoreCase(answer);
	}

	public void display() {
		System.out.println(text);
	}

}

