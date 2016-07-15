package com.nationwide.walker.blackjack;

import java.util.ArrayList;

public class Dealer extends Player{

	ArrayList<Card> dealerHand = new ArrayList<Card>();
	
	public Dealer(){
		super();
	}
	
	public void addCard(Card topCard){
		dealerHand.add(topCard);
		//playerHand.equals(dealerHand);
		handValue();
	}
	
	public void printHand(){

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
	
	public void handValue(){
		
		value = 0;
		System.out.println(playerHand.size());
		for (Card card : dealerHand){
			value = value + card.getNumValue();
		}
		if ((value > 21) && this.checkForAce()){
			value = value - 10;
		} 
		if (value > 21){
			value = -1;
		}
	}

}
