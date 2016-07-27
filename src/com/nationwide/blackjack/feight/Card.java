package com.nationwide.blackjack.feight;

/**
 * @author Suzanne Feight
 */

public class Card {
	
	private final CardFace face;
	private final CardSuit suit;
	private String cardDescription;
	
	public Card(CardSuit cardSuit, CardFace cardFace) {
		
		this.suit = cardSuit;
		this.face = cardFace;
		this.cardDescription = "";
	}
	
	public CardFace getFace() {
		
		return face;
	}
	
	public CardSuit getSuit() {
		
		return suit;
	}
	
	public int getCardValue() {
		
		return face.getCardValue();
	}
	
	public String getSuitValue() {
		
		return suit.getValue();
	}
	
	public String getCardDescription() {
		
		return cardDescription;
	}
	
	public void setCardDescription(String newCardDescription) {
		this.cardDescription = newCardDescription;
	}
	
	@Override
	public String toString() {
		
		String cardString = null;
		cardString = getSuitValue() + " " + getFace() + "(" + getCardValue() +  ") " + getCardDescription();
		return cardString;
	}
	
}
