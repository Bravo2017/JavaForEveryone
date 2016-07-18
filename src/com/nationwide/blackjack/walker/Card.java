package com.nationwide.blackjack.walker;
public class Card {
	
	String value;
	String suit;
	String name;
	int numValue;
	boolean isAce = false;

	
	public Card(){
		
	}

	public Card (String value, String suit){
		this.suit = suit;
		this.value = value;


	}

	public int getNumValue() {
		if (Card.isNumeric(value)){
			numValue = Integer.parseInt(value);
		}
		else if (value == "Ace") {
			numValue = 11;
			isAce = true;
		}
		else {
			numValue = 10;
		}
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
	
	public boolean getIsAce(){
		return isAce;
	}
	
	private static boolean isNumeric(String value){
		try{
			int testValue = Integer.parseInt(value);
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	
}
