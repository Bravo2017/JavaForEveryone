package com.nationwide.chapter9.walker;


public class QuestionTest {

	public static void main(String[] args) {

		Question testQuestion = new Question();
		
		testQuestion.setText("Who wrote The Lord of the Rings?");
		testQuestion.setAnswer("J.R.R. Tolkien");
		testQuestion.display();
		testQuestion.testDisplay();
		
		System.out.println("");
		System.out.println("Test One: j.r.r. Tolkien          Expected: true   Result: " + testQuestion.checkAnswer("j.r.r. Tolkien"));
		System.out.println("Test Two: J.R.R.     TOLKIEN      Expected: true   Result: " + testQuestion.checkAnswer("J.R.R.     TOLKIEN"));
		System.out.println("Test Three: JRR TOLKIEN           Expected: false  Result: " + testQuestion.checkAnswer("JRR TOLKIEN"));

	}

}

