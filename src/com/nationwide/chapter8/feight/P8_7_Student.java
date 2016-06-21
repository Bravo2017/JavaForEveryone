package com.nationwide.chapter8.feight;

/**
 * Implement a class Student. For the purpose of this exercise, a student has a
 * name and a total quiz score. Supply an appropriate constructor and methods
 * getName(), addQuiz(int score), getTotalScore(), and getAverageScore(). To
 * compute the latter, you also need to store the number of quizzes that the
 * student took.
 * 
 * @author Suzanne Feight
 * 
 */

public class P8_7_Student {

	public P8_7_Student(String newName) {

		this.studentName = newName;

	}

	private final String studentName;
	private int totalQuizScore = 0;
	private int numberQuizzesTaken;

	public String getName() {

		return studentName;

	}

	public void addQuiz(int score) {

		numberQuizzesTaken = numberQuizzesTaken + 1;
		totalQuizScore = totalQuizScore + score;
	}

	public int getTotalScore() {

		return totalQuizScore;

	}

	public double getAverageScore() {

		return totalQuizScore / numberQuizzesTaken;

	}

	public int getNumberQuizzesTaken() {
		return numberQuizzesTaken;
	}

}
