package com.nationwide.chapter8.thurston;

import java.util.*;

public class Student {
	String name;
	int quizesTaken = 0;
	int totalQuizScore;

	public Student() {
		this.name = getName();
		System.out.println("Please enter quiz scores, Q to quit:");
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int quizScore = in.nextInt();
			addQuiz(quizScore);
		}
		System.out.println("The total quiz score is " + getTotalScore()
				+ " for " + quizesTaken + " quizes taken.");
		System.out.println("The average score is " + getAverageScore());
	}

	public String getName() {
		Scanner userinput = new Scanner(System.in);
		System.out.println("What is the Student's first name?");
		String firstName = userinput.next();
		System.out.println("What is the Student's last name?");
		String lastName = userinput.next();
		System.out.println("Students name is " + lastName + ", " + firstName);
		String name = lastName + ", " + firstName;
		// userinput.close();
		return name;
	}

	public void addQuiz(int score) {
		totalQuizScore = totalQuizScore + score;
		quizesTaken++;
	}

	public int getTotalScore() {
		return totalQuizScore;
	}

	public int getAverageScore() {
		int output = totalQuizScore / quizesTaken;
		return output;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student aa = new Student();

	}

}
