package com.nationwide.chapter8.watson;

public class Class {

	/*
	 * Implement a class Student. For the purpose of this exercise, a student
	 * has a name and a total quiz score. Supply an appropriate constructor and
	 * methods getName(), addQuiz(int score), getTotalScore(), and
	 * getAverageScore(). To compute the latter, you also need to store the
	 * number of quizzes that the student took.
	 */

	private String name = null;
	private int totalScore = 0;
	private int averageScore = 0;
	private int quizesTaken = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addQuiz(int score) {
		quizesTaken++;
		totalScore = totalScore + score;
		System.out.println("Score of " + score + "has been added.");
	}

	public int getTotaltScore() {
		return totalScore;
	}

	public int getAverageScore() {
		averageScore = totalScore / quizesTaken;
		return averageScore;
	}

	public void setAverageScore(int averageScore) {
		this.averageScore = averageScore;
	}

}
