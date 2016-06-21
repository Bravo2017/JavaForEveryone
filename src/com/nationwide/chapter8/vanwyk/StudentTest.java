package com.nationwide.chapter8.vanwyk;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student("Austin"); // constructor method
		System.out.println("Name: " + student1.getName());
		student1.addQuiz(7.0);
		student1.addQuiz(6.0);
		student1.addQuiz(5.0);
		student1.addQuiz(4.0);
		student1.addQuiz(9.0);
		System.out.println("Total Score: " + student1.getTotalScore());
		System.out.println("Average Quiz Score: " + student1.getAverageScore());
	}

}
