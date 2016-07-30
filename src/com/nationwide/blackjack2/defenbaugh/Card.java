package com.nationwide.blackjack2.defenbaugh;

public class Card {

	private Suit cardSuit;

	private int cardNumber;

	public Card(Suit iSuit, int iNumber) {
		cardSuit = iSuit;
		cardNumber = iNumber;
	}

	public int getNumber() {
		return cardNumber;
	}

	public String toString() {

		String cardRank;

		switch (cardNumber) {

		case 1:
			cardRank = "Ace";
			break;

		case 11:
			cardRank = "Jack";
			break;

		case 12:
			cardRank = "Queen";
			break;

		case 13:
			cardRank = "King";
			break;

		default:
			cardRank = "Other";

		}

		if (cardRank == "Other") {
			return cardNumber + " of " + cardSuit.toString();
		} else {
			return cardRank + " of " + cardSuit.toString();
		}

	}

}
