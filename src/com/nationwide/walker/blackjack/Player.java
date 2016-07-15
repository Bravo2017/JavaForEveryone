package com.nationwide.walker.blackjack;
import java.util.ArrayList;

public class Player {
	
	ArrayList<Card> playerHand = new ArrayList<Card>();
	Deck deck = new Deck();
	int value;
	int playerNumber;

	
	public Player(Deck deck){
		this.deck = deck;
		//dealHand();
		handValue();
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	
	public int getPlayerNumber(){
		return playerNumber;
	}
	
	public void handValue(){
			value = 0;
		for (Card card : playerHand){
			value = value + card.getNumValue();
		}
		if ((value > 21) && this.checkForAce()){
					value = value - 10;
		} 
		if (value > 21){
			value = -1;
		}
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean checkForAce(){
		boolean hasAce = false;
		for (Card card : playerHand){
			if (card.getValue() == "String"){
				hasAce = true;
			}
		}
		return hasAce;
	}
	
	public void playerHit(){
		playerHand.add(deck.getTopCard());
		handValue();
	}
	
	
	public void printHand(){
		for (Card card : playerHand){
			System.out.print(card.getValue() + " of " + card.getSuit());
			System.out.print("(" + card.getNumValue() + ")");
			System.out.print("     ");
		}
		System.out.println("");
		System.out.println("Hand Value: " + this.getValue());
		System.out.println("");
	}
	
	public void addCard(Card topCard){
		
		playerHand.add(topCard);
		
	}
	
}
