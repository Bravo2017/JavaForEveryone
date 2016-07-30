package com.nationwide.blackjack2.walker;

public class Card {

	String value;
	String suit;
	String name;
	int numValue;
	boolean ace = false;
	boolean faceDown = false;

	public Card() {

	}

	public Card(String value, String suit) {

		this.suit = suit;
		this.value = value;

		if (isNumeric()) {
			numValue = Integer.parseInt(value);
		} else if (value == "Ace") {
			numValue = 11;
			ace = true;
		} else {
			numValue = 10;
		}

	}

	private boolean isNumeric() {
		try {
			int testValue = Integer.parseInt(value);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public int getNumValue() {
		return numValue;
	}

	public void setNumValue(int numValue) {
		this.numValue = numValue;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAce() {
		return ace;
	}

	public boolean isFaceDown() {
		return faceDown;
	}

	public void setFaceDown(boolean faceDown) {
		this.faceDown = faceDown;
	}

}
