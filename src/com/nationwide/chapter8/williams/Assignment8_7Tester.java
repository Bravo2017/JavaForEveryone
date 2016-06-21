package com.nationwide.chapter8.williams;

public class Assignment8_7Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Assignment8_7 student = new Assignment8_7();
		student.setName("Matthew Williams");
		student.addQuiz(90);
		student.addQuiz(80);
		student.addQuiz(100);
		student.addQuiz(90);
		student.addQuiz(70);
		System.out.println("Student:  " + student.getName()
				+ " has a total score of:  " + student.getTotalScore()
				+ " and an average score of:  " + student.getAverageScore());
	}

}
