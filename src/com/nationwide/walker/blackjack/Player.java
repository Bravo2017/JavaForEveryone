package com.nationwide.walker.blackjack;
import java.util.ArrayList;

public class Player {
	
	ArrayList<Card> playerHand = new ArrayList<Card>();
	Deck deck = new Deck();
	int value;
	
	public Player(Deck deck){
		this.deck = deck;
		dealHand();
		handValue();
	}

	public void dealHand(){
		
		playerHand.add(deck.getTopCard());
		playerHand.add(deck.getTopCard());
		
	}
	
	public void handValue(){
			value = 0;
		for (Card card : playerHand){
			value = value + card.getNumValue();
		}
	/*	while (value > 21){
			for (Card card : playerHand){
				if ((card.isAce) && (value > 21)){
					card.setNumValue(2);
					value = value - 9;
				}
			}
	*/
		//System.out.println(value);
		//return value;
	}
	
	public void playerHit(){
		
	}
	
	public static int highestHand(ArrayList<Player> players){
	    int highest = 0;
		for (Player currentPlayer : players){
			if ((currentPlayer.getValue() > highest) && (currentPlayer.getValue() < 21)){
				highest = currentPlayer.getValue();
			}
		}
		return highest;
	}
	
	public void printHand(){
		for (Card card : playerHand){
			System.out.print(card.getValue() + " " + card.getSuit());
			System.out.print("(" + card.getNumValue() + ")");
			System.out.print("     ");
		}
		System.out.println("");
		System.out.println("Hand Value: " + this.getValue());
		System.out.println("");
	}
	
	public int getValue(){
		return value;
	}
	
}
