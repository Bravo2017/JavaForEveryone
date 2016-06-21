package com.nationwide.chapter8.tekippe;

public class Student {

	/**
	 * @param args
	 */
	private static String studentName;
	private static double totalQuizScore;
	private static int numberQuizTaken = 0;

	public Student() {

	}

	public static void main(String[] args) {

		studentName = getName();
		addQuiz(98.0);
		addQuiz(95.0);
		addQuiz(100.0);
		addQuiz(99.9);
		totalQuizScore = getTotalScore();
		double aveQuizScore = getAverageScore();

		System.out.println("Student Name : " + studentName);
		System.out.println("Total points " + totalQuizScore + " on "
				+ numberQuizTaken + " quizzes.");
		System.out.println("The average score was : " + aveQuizScore);

	}

	private static String getName() {
		studentName = "Ron TeKippe";
		return studentName;
	}

	private static void addQuiz(double score) {
		totalQuizScore = totalQuizScore + score;
		numberQuizTaken++;
	}

	private static double getTotalScore() {
		return totalQuizScore;
	}

	private static double getAverageScore() {
		double aveScore = totalQuizScore / numberQuizTaken;
		return aveScore;

	}

}