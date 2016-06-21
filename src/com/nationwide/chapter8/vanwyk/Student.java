package com.nationwide.chapter8.vanwyk;

public class Student {

	/**
	 * Implement a class Student. For the purpose of this exercise, a student
	 * has a name and a total quiz score. Supply an appropriate constructor and
	 * methods getName(), addQuiz(int score), getTotalScore(), and
	 * getAverageScore(). To compute the latter, you also need to store the
	 * number of quizzes that the student took.
	 */

	// Private Variables
	private String name;
	private double totalScore;
	private int quizCount;
	private double averageScore;

	// Student constructor method
	public Student(String name) {
		this.name = name;
	}

	// get name
	public String getName() {
		return name;
	}

	// add quiz scores
	public void addQuiz(double score) {
		totalScore += score;
		quizCount += 1;
	}

	// get total score
	public double getTotalScore() {
		return totalScore;
	}

	// get average score
	public double getAverageScore() {
		return averageScore = totalScore / quizCount;
	}

	public static void main(String[] args) {

	}

}
