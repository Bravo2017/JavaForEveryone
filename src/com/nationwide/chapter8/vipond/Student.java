package com.nationwide.chapter8.vipond;

/*
 * Implement a class Student. For the purpose of this exercise, a student has a name and a total quiz score. 
 * Supply an appropriate constructor and methods getName(), addQuiz(int score), getTotalScore(), and getAverageScore(). 
 * To compute the latter, you also need to store the number of quizzes that the student took. 
 */

public class Student {

	// instance variables
	private String name;
	private double quizScore;
	private static double numofQuizzesTaken = 0;

	public Student(String pName, double pQuizScore) {
		name = pName;
		quizScore = pQuizScore;
		numofQuizzesTaken++;
	}

	public String getName() {
		return name;
	}

	public double getTotalscore() {
		return quizScore;
	}

	public void addQuiz(double score) {
		quizScore = quizScore + score;
		numofQuizzesTaken++;
	}

	public double getAverageScore() {
		return quizScore / numofQuizzesTaken;
	}

	public static void main(String[] args) {

		Student stud = new Student("TalentedGuy", 99.9);
		System.out.println("Student name is " + stud.getName());
		System.out.println("First Quiz score is " + stud.getTotalscore());
		double score = 98;
		stud.addQuiz(score);
		double score1 = 95;
		stud.addQuiz(score1);
		double score2 = 100;
		stud.addQuiz(score2);
		System.out.println("Number of quizzes is " + numofQuizzesTaken);
		System.out.println("Average Score is " + stud.getAverageScore());

	}

}
