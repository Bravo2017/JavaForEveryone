package com.nationwide.chapter9.feight;

import java.util.Scanner;

/**
 * 
 * @author Suzanne Feight
 * 
 */

public class MultiChoiceQuestion_Test {

	public static void main(String[] args) {

		MultiChoiceQuestion question = new MultiChoiceQuestion();

		question.setText("Which of the following are fruits? \nEnter the numbers representing your answers. \nSeparate your answers with a space.");
		question.addChoice("Apple", true);
		question.addChoice("Beet", false);
		question.addChoice("Grape", true);
		question.addChoice("Onion", false);

		question.display();
		System.out.print("Your answer: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(question.checkAnswer(response));
		in.close();
		System.out.println();

		response = "1 3";
		System.out.println("Test (1 3):  Expected: true, Actual: "
				+ question.checkAnswer(response));

		response = "3 1";
		System.out.println("Test (3 1):  Expected: true, Actual: "
				+ question.checkAnswer(response));

		response = "2 4";
		System.out.println("Test (2 4):  Expected: false, Actual: "
				+ question.checkAnswer(response));

		response = "1 4";
		System.out.println("Test (1 4):  Expected: false, Actual: "
				+ question.checkAnswer(response));

		response = "2 3 4";
		System.out.println("Test (2 3 4):  Expected: false, Actual: "
				+ question.checkAnswer(response));

	}

}
