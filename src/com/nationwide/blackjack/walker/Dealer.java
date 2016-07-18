package com.nationwide.blackjack.walker;


public class Dealer extends Player{
	
	public void printHand(){

		System.out.print("Dealer:      ");
		
		for (Card card : playerHand){
			System.out.print(card.getValue() + " of " + card.getSuit());
			System.out.print("(" + card.getNumValue() + ")");
			System.out.print("     ");
		}
		System.out.println("");
		System.out.println("Hand Value: " + this.getValue());
		System.out.println("");
		
	}

}
