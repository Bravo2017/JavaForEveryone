package com.nationwide.chapter8.davis;

import java.util.Scanner;

public class P8Q7Student {
	// P8.7 Implement a class Student.
	// For the purpose of this exercise,
	// a student has a name and a total quiz score.
	// Supply an appropriate constructor and
	// methods getName(), addQuiz(double score),
	// getTotalScore(), getAverageScore().
	// To compute the latter, you also need to
	// store the number of quizzes that the student took.

	public static String studentName;
	public static double studentQuizScore;
	private static double totalScore;
	private static int numberOfQuizzes;
	private static double AverageScore;

	public P8Q7Student() {
		// constructor
		String studentName;
		double studentQuizScore;
		double totalScore = 0;
		int numberOfQuizzes = 0;
		double AverageScore = 0;

	}

	public static void main(String[] args) {
		studentName = getName();
		System.out.println("Please, enter the first quiz score ");
		double score = new Scanner(System.in).nextDouble();
		addQuiz(score);
		getAverageScore();
	}

	private static String getName() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please, enter student name:");
		String name = userInput.nextLine();
		return name;
	}

	static void addQuiz(double score) {
		while (score != -1) {
			numberOfQuizzes++;
			studentQuizScore = score;
			getTotalScore();
			System.out.print("\nEnter -1 to finish or enter score of quiz #"
					+ (numberOfQuizzes + 1) + ": ");
			score = new Scanner(System.in).nextDouble();
		}
	}

	static void getTotalScore() {
		totalScore = totalScore + studentQuizScore;
		System.out.println("Total so far = " + totalScore);
	}

	static void getAverageScore() {
		AverageScore = totalScore / numberOfQuizzes;
		System.out.printf("\n" + studentName + "'s Average Points from all "
				+ numberOfQuizzes + " Quizzes = " + " %.2f", AverageScore);
	}
}