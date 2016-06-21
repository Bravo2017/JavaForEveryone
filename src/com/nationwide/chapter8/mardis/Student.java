package com.nationwide.chapter8.mardis;

import java.util.Scanner;

public class Student {

	/**
	 * P 8.7 Implement a class Student. For the purpose of this exercise, a
	 * student has a name and a total quiz score. Supply an appropriate
	 * constructor and methods getName(), addQuiz(int score), getTotalScore(),
	 * and getAverageScore(). To compute the latter, you also need to store the
	 * number of quizzes that the student took.
	 */

	private String name;
	private int totalQuizScore;
	private int count;

	public Student() {
		name = "none";
		totalQuizScore = 0;
		count = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addQuiz(int score) {
		totalQuizScore = totalQuizScore + score;
		count++;
	}

	public int getTotalScore() {
		return totalQuizScore;
	}

	public double getAverageScore() {
		return totalQuizScore / count;

	}

	public static void main(String[] args) {

		Student student = new Student();

		int choice = 0;

		// scanner input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name ");
		String resp = in.next();
		student.setName(resp);

		while (choice != 999) {
			System.out.println("Enter quiz score or 999 to exit ");
			choice = in.nextInt();
			if (choice != 999) {
				student.addQuiz(choice);
			}
		}

		System.out.println(student.getName() + " has a total score of "
				+ student.getTotalScore() + " which averages to "
				+ student.getAverageScore());

		in.close();

	}

}
