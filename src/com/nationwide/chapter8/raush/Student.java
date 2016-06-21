package com.nationwide.chapter8.raush;

/**
 * Implement a class Student. For the purpose of this exercise, a student has a
 * name and a total quiz score. Supply an appropriate constructor and methods
 * getName(), addQuiz(int score), getTotalScore(), and getAverageScore(). To
 * compute the latter, you also need to store the number of quizzes that the
 * student took.
 */

public class Student {
	private String name;
	private double totalScore;
	private int scoreCount;

	/**
	 * Adds an item to this student
	 * 
	 * @param name
	 *            the name of the student
	 */
	public Student(String name) {
		// Constructor stub
		this.name = name;
	}

	/*
	 * Gets the name of the student
	 * 
	 * @return the student name
	 */
	public String getName() {
		return this.name;
	}

	/*
	 * total the quiz scores
	 * 
	 * @param score Score from individual exam/quiz
	 */
	public void addQuiz(double score) {
		this.totalScore += score;
		this.scoreCount += 1;
	}

	/*
	 * Gets the total test scores
	 * 
	 * @return the Total of all test scores
	 */
	public double getTotalScore() {
		return this.totalScore;
	}

	/*
	 * calculates the average of all test scores
	 * 
	 * @return the average of all test scores
	 */
	public double getAverageScore() {
		return this.totalScore / this.scoreCount;
	}
}
