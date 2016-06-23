package com.nationwide.chapter9.walker;

import java.util.Arrays;

public class MultiChoiceQuestion extends Question {
	
	private String answer;
	private String text;
	private String choiceA;
	private String choiceB;
	private String choiceC;
	private String choiceD;
	
	public void setChoices(String a, String b, String c, String d){
		
		choiceA = a;
		choiceB = b;
		choiceC = c;
		choiceD = d;
		
	}
	
	public void display(){
		text = super.getText();
		System.out.println(text);
		System.out.println("A. " + choiceA);
		System.out.println("B. " + choiceB);
		System.out.println("C. " + choiceC);
		System.out.println("D. " + choiceD);
		
	}
	
	/* 
	 * Checks the given response against the correct answer. The response can be given in any format, but all correct answers must be given.
	 */

	public boolean checkAnswer(String response) {
		
		answer = super.getAnswer();
		
		char responseArray[] = response.replaceAll("\\s", "").toCharArray();
		char answerArray[] = answer.replaceAll("\\s", "").toCharArray();
		
		Arrays.sort(responseArray);
		Arrays.sort(answerArray);
		
		String responseCompare = String.valueOf(responseArray);
		String answerCompare = String.valueOf(answerArray);
		
		return responseCompare.equalsIgnoreCase(answerCompare);
		
	}
	
}

