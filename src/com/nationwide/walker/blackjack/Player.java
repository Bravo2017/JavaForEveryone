package com.nationwide.walker.blackjack;
import java.util.ArrayList;

public class Player {
	
	ArrayList<Card> playerHand = new ArrayList<Card>();
	Deck deck = new Deck();
	int value;
	static int winnerIndex;
	
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
		
	}
	
	public static int highestHand(ArrayList<Player> players){
	    int highest = 0;
		for (Player p : players){
			if ((p.getValue() > highest) && (p.getValue() < 21)){
				highest = p.getValue();
				winnerIndex = players.indexOf(p);
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
	
	public static int getWinner(){
		return winnerIndex;
	}
	
}
