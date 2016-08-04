package com.nationwide.blackjack3.kuhl;

public class Card {
    //Suit enumeration
	// Value Enumeration
	private Suit suit;
	private Value value;
	
	//Card Constructor
	public Card(Suit suit, Value value){
		this.suit = suit;
		this.value = value;
	}
	
	//Return Suit and Value
	public String toString(){
		return this.suit.toString() + "-" + this.value.toString();
	}
	
	//Use this to check values in deck class to determine points in users hand.
	public Value getValue(){
		return this.value;
	}


	
}
