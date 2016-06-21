package com.nationwide.chapter8.williams;

public class Assignment8_7 {
	private String name;
	private double totalQuizScores = 0;
	private static int scoreCounter;

	public String getName() {
		return name;
	}

	public void setName(String studentName) {
		name = studentName;
	}

	public void addQuiz(int score) {
		totalQuizScores = totalQuizScores + score;
		scoreCounter++;
	}

	public double getTotalScore() {
		return totalQuizScores;
	}

	public double getAverageScore() {
		return totalQuizScores / scoreCounter;
	}
}
