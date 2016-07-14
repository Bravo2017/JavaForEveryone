package com.nationwide.blackjack.feight;

public enum CardSuit {

	HEARTS("H"), DIAMONDS("D"), SPADES("S"), CLUBS("C");
	
	private String value;
	
	private CardSuit(String newValue) {
		this.value = newValue;
	}
	
	public String getValue() {
		return value;
	}

}
