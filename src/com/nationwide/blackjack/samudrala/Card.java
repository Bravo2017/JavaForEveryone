package com.nationwide.blackjack.samudrala;

/**
 * Created by SAMUDRS1 on 7/16/2016.
 */
public class Card {
	int cardValue;
	String cardName;
	String cardSuit;

	public Card(int inCardValue, String inCardName, String inCardSuit) {
		cardValue = inCardValue;
		cardName = inCardName;
		cardSuit = inCardSuit;
	}

	public Card() {

	}

	public int getCardValue() {
		return cardValue;
	}

	public String getCardName() {
		return cardName;
	}
}
