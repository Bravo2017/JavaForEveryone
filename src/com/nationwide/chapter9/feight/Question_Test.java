package com.nationwide.chapter9.feight;

/**
 * 
 * @author Suzanne Feight
 * 
 */

public class Question_Test {

	public static void main(String[] args) {

		Question q = new Question();
		q.setText("Who was the inventor of Java?");
		q.setAnswer("James Gosling");

		System.out.println("Test 1: 'JaMeS GosLing' - Expected: true, Actual: "
				+ q.checkAnswer("JaMeS GosLing"));

		System.out.println("Test 2: 'jamesGosling' - Expected: true, Actual: "
				+ q.checkAnswer("jamesGosling"));

		System.out
				.println("Test 3: ' j a m e s     GOSling' - Expected: true, Actual: "
						+ q.checkAnswer(" j a m e s     GOSling"));
	}

}
