package com.nationwide.chapter8.nelson;

/*
 * Java for Everyone - Chapter 8 - Assignment 8.7
 * Implement a Student class with name and total quiz score.
 * Supply a constructor and methods getName(), addQuiz(int score),
 *    getTotalScore(), and getAverageScore().
 * 
 */
public class Student {

	private String name;
	private double scoreTotal = 0;
	private int scoreCount = 0;

	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.name = "Terri";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("");

		int count = student.addQuiz(95);
		count = student.addQuiz(92);
		count = student.addQuiz(90);
		count = student.addQuiz(97);

		String name = student.getName();

		double totalScore = student.getTotalScore();

		double averageScore = student.getAverageScore();
		System.out.println("Total Score: " + totalScore + " Quiz Count: "
				+ count + " Average Score: " + averageScore + " for student: "
				+ name);
	}

	public String getName() {
		return this.name;
	}

	public int addQuiz(int score) {
		this.scoreTotal = this.scoreTotal + score;
		this.scoreCount++;
		return this.scoreCount;
	}

	public double getTotalScore() {
		return this.scoreTotal;
	}

	public double getAverageScore() {
		return this.scoreTotal / this.scoreCount;
	}
}
