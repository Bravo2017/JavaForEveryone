
import java.util.ArrayList;

/**
 * @author DAVISK51
 * 
 */
public class MultiChoiceQuestion extends ChoiceQuestion {
	// P9.5 Add a class MultiChoiceQuestion to the question hierarchy
	// of Section 9.1 that allows multiple correct choices.
	// The respondent should provide all correct choices, separated by spaces.
	// Provide instructions in the question text.
	//
	// This instance variable is added to the subclass

	String multiChoiceAnswer = "";
	private ArrayList<String> choices;

	/**
	 * Constructs a choice question
	 */
	public MultiChoiceQuestion() {
		choices = new ArrayList<String>();
	}

	/**
	 * Adds an answer choice to this question. Override ChoiceQuestion
	 * addChoice.
	 * 
	 * @param choice
	 *            the choice to add
	 * @param correct
	 *            true if this is the correct choice, false otherwise
	 */
	// This method is added to the subclass
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			multiChoiceAnswer = multiChoiceAnswer + choices.size();
			String choiceString = multiChoiceAnswer;
			this.setAnswer(choiceString);
		}
	}

	// This method overrides a method from the superclass
	public void display() {
		super.display(); // Display the question text
							// Display the answer choices
		// (why cant I get this from "ChoiceQuestion?)
		for (int i = 0; i < choices.size(); i++) {
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + ": " + choices.get(i));
		}
	}
}
