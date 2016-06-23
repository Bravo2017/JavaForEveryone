package com.nationwide.chapter9.walker;


public class MultiChoiceTest {

	public static void main(String[] args) {
		
		MultiChoiceQuestion testQuestion = new MultiChoiceQuestion();
		
		testQuestion.setText("Which cities are US capitals?");
		testQuestion.setChoices("Des Moines", "Anchorage", "Annapolis", "Santa Fe");
		testQuestion.setAnswer("A C D");
		testQuestion.display();
		System.out.println("");
		
		testQuestion.testDisplay();
		System.out.println("Test One:   A C D        Expected: true   Result: " + testQuestion.checkAnswer("A C D"));
		System.out.println("Test Two:   dca          Expected: true   Result: " + testQuestion.checkAnswer("dca"));
		System.out.println("Test Three: C A          Expected: false  Result: " + testQuestion.checkAnswer("C A"));
		System.out.println("Test Four:  dc           Expected: false  Result: " + testQuestion.checkAnswer("dc"));
		
		
		
	}
	
}

