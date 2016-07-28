package com.nationwide.blackjack2.vanwyk;

public class Card {

	private Suit suitValue;

	private int numberValue;

	// Constructor to create the card set up which I will use suit enum and a
	// switch statement to complete.
	public Card(Suit theSuit, int theNumber) {

		this.suitValue = theSuit;

		if (theNumber >= 1 && theNumber <= 13) {
			this.numberValue = theNumber;
		}
	}

	// Switch statement to convert value into words
	public String toString() {

		String numStr = "null";

		// switch statement to display card value in words
		switch (this.numberValue) {

		case 2:
			numStr = "Two";
			break;

		case 3:
			numStr = "Three";
			break;

		case 4:
			numStr = "Four";
			break;

		case 5:
			numStr = "Five";
			break;

		case 6:
			numStr = "Six";
			break;

		case 7:
			numStr = "Seven";
			break;

		case 8:
			numStr = "Eight";
			break;

		case 9:
			numStr = "Nine";
			break;

		case 10:
			numStr = "Ten";
			break;

		case 11:
			numStr = "Jack";
			break;

		case 12:
			numStr = "Queen";
			break;

		case 13:
			numStr = "King";
			break;

		case 1:
			numStr = "Ace";
			break;

		}

		return numStr + " of " + suitValue.toString();

	}

	// class that returns my number to complete card build process
	public int getNumber() {
		return numberValue;
	}
}