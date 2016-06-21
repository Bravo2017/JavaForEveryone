package com.nationwide.chapter8.raush;

public class StudentTester {

	/**
	 * @param Height
	 *            radius
	 */
	public static void main(String[] args) {

		/* the 'new' invokes the constructor */
		Student student1 = new Student("Larry");
		student1.addQuiz(88);
		student1.addQuiz(92);
		student1.addQuiz(98);
		student1.addQuiz(87);
		double studentScore = student1.getTotalScore();
		String studentName = student1.getName();
		double studentAvg = student1.getAverageScore();

		System.out.println("Student name is " + studentName);
		System.out.printf("Student total score is %.0f\n", studentScore);
		System.out.printf("Student average score is %.2f\n", studentAvg);

	}

}