package com.nationwide.chapter9.lark;

public class Question_9_3 {

	private String text;
	private String answer;

	public Question_9_3() {
		text = "";
		answer = "";
	}

	public void setText(String questionText) {
		text = questionText;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}

	public boolean checkAnswer(String response) {
		return response.trim().replaceAll("\\s+", " ")
				.equalsIgnoreCase(answer.trim().replaceAll("\\s+", " "));
	}

	public void disply() {
		System.out.println(text);
	}

}
