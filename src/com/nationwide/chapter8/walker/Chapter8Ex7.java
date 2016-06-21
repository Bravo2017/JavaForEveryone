package com.nationwide.chapter8.walker;

import java.util.Scanner;
import java.util.ArrayList;

/*
 * Student Class Example
 */

public class Chapter8Ex7 {

	String studentName;
	int totalScore;
	int numberOfQuizes;
	ArrayList<Integer> quizScores = new ArrayList<Integer>();
	Scanner in = new Scanner(System.in);

	public Chapter8Ex7(String studentName, int numberOfQuizes) {
		this.studentName = studentName;
		this.numberOfQuizes = numberOfQuizes;
	}

	public void addQuiz() {
		ArrayList<Integer> quizScores = new ArrayList<Integer>();
		for (int i = 1; i <= numberOfQuizes; i++) {
			System.out.print("Enter quiz score: ");
			int score = in.nextInt();
			this.quizScores.add(score);
			this.totalScore = totalScore + score;
		}
		System.out.println("");
	}

	public String getName() {
		return studentName;
	}

	public static void getTotalScore(ArrayList<Chapter8Ex7> studentList) {
		for (Chapter8Ex7 s : studentList) {
			System.out.print(s.getName());
			for (int i = 0; i < s.quizScores.size(); i++) {
				System.out.print("     " + s.quizScores.get(i));
			}
			System.out.println("     Total: " + s.totalScore);
		}
		System.out.println("");
	}

	public static void getAverageScore(ArrayList<Chapter8Ex7> studentList) {
		for (Chapter8Ex7 s : studentList) {
			System.out.print(s.getName());
			for (int i = 0; i < s.quizScores.size(); i++) {
				System.out.print("     " + s.quizScores.get(i));
			}
			System.out.println("     Average: " + s.totalScore
					/ s.quizScores.size());
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		ArrayList<Chapter8Ex7> studentList = new ArrayList<Chapter8Ex7>();
		Scanner in = new Scanner(System.in);
		int userChoice = 1;
		int numberOfQuizes;
		String newName;

		do {
			System.out.println("1. Add Student");
			System.out.println("2. Get Student Quiz Average");
			System.out.println("3. Get Student Total Quiz Score");
			System.out.println("0. Exit");
			System.out.print("What would you like to do? ");
			userChoice = in.nextInt();
			System.out.println("");

			if (userChoice == 1) {
				System.out.print("What is the student's name? ");
				newName = in.next();
				System.out.print("How many quizes did the student take? ");
				numberOfQuizes = in.nextInt();
				Chapter8Ex7 student = new Chapter8Ex7(newName, numberOfQuizes);
				studentList.add(student);
				student.addQuiz();
			} else if (userChoice == 2) {
				if (studentList.size() != 0) {
					getAverageScore(studentList);
				} else {
					System.out.println("No students have been added.");
				}
			} else if (userChoice == 3) {
				if (studentList.size() != 0) {
					getTotalScore(studentList);
				} else {
					System.out.println("No students have been added.");
				}
			} else if (userChoice == 0) {
				break;
			} else {
				System.out.println("Invalid Selection");
				System.out.println("");
			}
		} while (userChoice != 0);
		in.close();
	}

}
