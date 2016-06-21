package com.nationwide.chapter8.defenbaugh;

/**
 * @author Valerie Defenbaugh Implement a class Student. For the purpose of this
 *         exercise, a student has a name and a total quiz score. Supply an
 *         appropriate constructor and methods getName(), addQuiz(int score),
 *         getTotalScore(), and getAverageScore(). To compute the latter, you
 *         also need to store the number of quizzes that the student took.
 */

public class Student {

	private String studentName;
	private int quiz_count;
	private int totalScore;
	private double avgScore;
	private int score[];

	public Student() {
		studentName = "";
		quiz_count = 0;
		totalScore = 0;
		avgScore = 0;
		score = new int[100];
	}

	public Student(String n) {
		studentName = n;
		score = new int[100];
	}

	public String getName() {
		return studentName;
	}

	public void addQuiz(int s) {
		score[quiz_count] = s;
		quiz_count++;
		totalScore = totalScore + s;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public int getNumQuizzes() {
		return quiz_count;
	}

	public double getAverageScore() {
		int numQuizzes = getNumQuizzes();
		avgScore = totalScore / numQuizzes;
		return avgScore;
	}

}
