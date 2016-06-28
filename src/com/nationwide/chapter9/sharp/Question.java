package com.nationwide.chapter9.sharp;

public class Question {

	private String text;
	private String answer;

	public Question() {
		text = "";
		answer = "";
	}

	public void addText(String additionalText) {
		text += " " + additionalText;
	}

	public void setText(String questionText) {
		text = questionText;

	}

	public void setAnswer(String correctResponse) {
		answer = correctResponse;

	}

	public boolean checkAnswer(String response) {
		return response.toLowerCase().equals(answer.toLowerCase());

	}

	public void display() {
		System.out.println(text);
	}
}
