package com.nationwide.chapter9.nelson;

import java.util.ArrayList;
import java.util.Scanner;

import com.nationwide.chapter9.ChoiceQuestion;

/*  P9.5 Add a class MultiChoiceQuestion to the question hierarchy
 *  of Section 9.1 that allows multiple correct choices. 
 *  The respondent should provide all correct choices, 
 *  separated by spaces. Provide instructions in question text.*/

public class MultiChoiceQuestion extends ChoiceQuestion {
	private ArrayList<String> allChoices;

	public MultiChoiceQuestion() {
		// TODO Auto-generated constructor stub
		super();
		this.allChoices = new ArrayList<String>();
	}

	public void setAnswer(String correctResponse) {
		this.allChoices.add(correctResponse);
	}

	public boolean checkAnswer(String response) {
		Scanner in = new Scanner(response);
		ArrayList<String> correctChoice = new ArrayList<String>();

		int totalChoices = 0;
		while (in.hasNext()) {
			String answer = in.next();
			if (this.allChoices.contains(answer)
					&& !correctChoice.contains(answer)) {
				correctChoice.add(answer);
			}
			totalChoices += 1;
			in.close();
		}

		return correctChoice.size() == this.allChoices.size()
				&& totalChoices == allChoices.size();
	}

	public void display() {
		super.display();
		System.out.println("List all correct choices separated by spaces");
	}

}
