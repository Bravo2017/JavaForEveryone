package com.nationwide.chapter8.feight;

/**
 * 
 * @author Suzanne Feight
 * 
 */

public class P8_7_Student_Test {

	public static void main(String[] args) {

		P8_7_Student student = new P8_7_Student("John Smith");

		// Test getName()
		System.out.println("Test getName() : Expected: John Smith, Actual: "
				+ student.getName());

		// Test addQuiz()
		student.addQuiz(95);
		student.addQuiz(80);
		student.addQuiz(98);
		student.addQuiz(87);
		System.out.println("Test addQuiz() : Expected 4, Actual: "
				+ student.getNumberQuizzesTaken());

		// Test getTotalScore()
		System.out.println("Test getTotalScore() : Expected: 360, Actual: "
				+ student.getTotalScore());

		// Test getAverageScore()
		System.out.println("Test getAverageScore() : Expected: 90.0, Acutal: "
				+ student.getAverageScore());
	}
}
