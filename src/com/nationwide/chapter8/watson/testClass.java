package com.nationwide.chapter8.watson;

public class testClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class student1 = new Class();

		student1.setName("Mike");

		student1.addQuiz(95);
		student1.addQuiz(79);
		student1.addQuiz(100);
		student1.addQuiz(88);
		student1.addQuiz(88);
		student1.addQuiz(92);
		student1.addQuiz(90);
		student1.addQuiz(84);
		student1.addQuiz(75);

		student1.getTotaltScore();

		System.out.println("Student's name is " + student1.getName() + ".");
		System.out.print("Average score from quizes taken during the term is "
				+ student1.getAverageScore() + ".");
		// System.out.println(student1.getAverageScore());
		// System.out.println("");

	}
}
