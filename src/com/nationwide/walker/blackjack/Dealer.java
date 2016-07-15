package com.nationwide.walker.blackjack;

import java.util.ArrayList;

public class Dealer extends Player{

	ArrayList<Card> dealerHand = new ArrayList<Card>();
	
	public Dealer(){
		dealerHand.equals(playerHand);
	}
	
	public void addCard(Card topCard){
		dealerHand.add(topCard);
	}
	
	public void printHand(){
		
		playerHand.equals(dealerHand);
		System.out.print("Dealer:      ");
		
		for (Card card : dealerHand){
			System.out.print(card.getValue() + " of " + card.getSuit());
			System.out.print("(" + card.getNumValue() + ")");
			System.out.print("     ");
		}
		System.out.println("");
		System.out.println("Hand Value: " + this.getValue());
		System.out.println("");
		
	}

	
}
