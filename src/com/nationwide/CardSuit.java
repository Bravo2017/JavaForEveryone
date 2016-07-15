package com.nationwide.blackjack.feight;

public enum CardSuit {

	HEARTS("H"), DIAMONDS("D"), SPADES("S"), CLUBS("C");
	
	private String suit;
	
	private CardSuit(String newSuit) {
		this.suit = newSuit;
	}
	
	public String getValue() {
		return suit;
	}

}
