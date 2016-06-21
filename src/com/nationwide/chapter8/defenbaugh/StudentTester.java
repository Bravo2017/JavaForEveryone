package com.nationwide.chapter8.defenbaugh;

import java.util.Scanner;

public class StudentTester {

	/**
	 * @author Valerie Defenbaugh Chapter 8 P8.7 Tester for the Student class
	 */
	public static void main(String[] args) {

		System.out.print("Please enter the student's name: ");

		Scanner inName = new Scanner(System.in);
		String studentName = inName.next();

		Student student = new Student(studentName);

		String name = student.getName();

		int quizScore = 0;
		int totalScore = 0;
		int numOfQuizes = 0;

		while (quizScore != -1) {
			System.out.print("Please enter the next quiz score for " + name
					+ ".  Enter -1 to quit: ");
			Scanner inScore = new Scanner(System.in);
			quizScore = inScore.nextInt();
			if (quizScore == -1) {
				// Do nothing
			} else {
				student.addQuiz(quizScore);
			}
		}

		System.out.println("The total quiz score for " + name + " is "
				+ student.getTotalScore() + ".");
		System.out.println("The average quiz score for " + name + " is "
				+ student.getAverageScore());

	}

}
