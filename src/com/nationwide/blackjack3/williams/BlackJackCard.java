package com.nationwide.blackjack3.williams;

public class BlackJackCard extends Card {
	private int numericValue;
	public BlackJackCard(){
		numericValue = 0;
	}
	public int getNumericValue() {
		return numericValue;
	}
	public void setNumericValue(int numericValue) {
		this.numericValue = numericValue;
	}
}